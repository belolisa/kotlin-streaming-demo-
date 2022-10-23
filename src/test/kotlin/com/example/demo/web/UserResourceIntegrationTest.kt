package com.example.demo.web


import com.example.demo.Order
import com.example.demo.User
import com.example.demo.UserProfile
import com.example.demo.dao.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserResourceIntegrationTest(
    @Autowired val restTemplate: TestRestTemplate,
    @Autowired val userRepository: UserRepository,
    @Autowired val orderRepository: OrderRepository,
    @Autowired val videoRepository: VideoRepository
) {

    @Test
    fun `Assert users list content and status code`() {
        val entity = restTemplate.getForEntity<List<User>>("/users")

        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)

        val users = restTemplate.exchange(
            "/users",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<List<User>>() {}
        )
        assertThat(users.body).extracting("name")
            .contains("lb", "Ann92")
    }

    @Test
    fun `Assert get user profile by id`() {
        val id = userRepository.findByLoginEquals("lb")?.first()?.id
        val entity = restTemplate.getForEntity<UserProfile>("/users/${id}/profile")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body?.balance).isEqualTo(1000.0)
        assertThat(entity.body?.name).isEqualTo("lb")
    }

    @Test
    fun `Assert user not found by id`() {
        val responseEntity = restTemplate.getForEntity<String>("/users/100/profile")
        assertThat(responseEntity.statusCode).isEqualTo(HttpStatus.NOT_FOUND)
    }

    @Test
    fun `Assert get user balance by id`() {
        val id = userRepository.findByLoginEquals("lb")?.first()?.id
        val balance = restTemplate.getForEntity<Double>("/users/${id}/balance")
        assertThat(balance.body).isEqualTo(1000.0)
    }

    @Test
    fun `Assert increase balance by id`() {
        val id = userRepository.findByLoginEquals("Ann92")?.first()?.id
        restTemplate.put("/users/${id}/balance", 1000.5)
        val balance = userRepository.findBalanceById(id!!)
        assertThat(balance).isEqualTo(1200.5)
    }

    @Test
    fun `Assert not update balance for not supported amount`() {
        val id = userRepository.findByLoginEquals("lb")?.first()?.id
        restTemplate.put("/users/${id}/balance", 0)
        val balance = userRepository.findBalanceById(id!!)
        assertThat(balance).isEqualTo(1000.0)
    }

    @Test
    fun `Assert create order`() {
        val user = userRepository.save(UserEntity(login = "new user", firstName = "name", secondName = "surname"))
        val movie = videoRepository.findByNameEquals("Pulp Fiction")?.first()
        val uriVariables: MutableMap<String, String> = HashMap()
        uriVariables["userId"] = user.id.toString()
        val postForEntity = restTemplate.postForEntity<Order>(
            "/users/${user.id}/orders/",
            Order(null, movie!!.id.toString()),
            Order::class.java,
            uriVariables
        )
        assertThat(postForEntity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(postForEntity.body?.movieId).isEqualTo(movie.id.toString())
        assertThat(postForEntity.body?.id).isNotNull()

        val updatedBalance = userRepository.findBalanceById(user.id)
        assertThat(updatedBalance).isEqualTo(user.balance - movie.cost)
    }

    @Test
    fun `Assert get order`() {
        val user = userRepository.save(UserEntity(login = "new user", firstName = "name", secondName = "surname"))
        val movie = videoRepository.findByNameEquals("Pulp Fiction")?.first()
        val orderEntity = orderRepository.save(OrderEntity(user = user!!, video = movie!!))
        val resultOrder = restTemplate.getForEntity<Order>("/users/${user.id}/orders/${orderEntity.id}")
        assertThat(resultOrder.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(resultOrder.body?.movieId).isEqualTo(movie.id.toString())
        assertThat(resultOrder.body?.id).isEqualTo(orderEntity.id.toString())
    }

}