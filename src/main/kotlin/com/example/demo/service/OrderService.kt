package com.example.demo.service

import com.example.demo.Order
import com.example.demo.dao.VideoRepository
import com.example.demo.dao.OrderEntity
import com.example.demo.dao.OrderRepository
import com.example.demo.dao.UserRepository
import com.example.demo.web.*
import org.springframework.stereotype.Service
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Service
class OrderService(
    val orderRepository: OrderRepository,
    val userRepository: UserRepository,
    val videoRepository: VideoRepository,
    val entityManager: EntityManager
) {

    @Transactional
    fun createOrder(userId: String, order: Order): Order {
        val user = userRepository.findById(userId.toLong()).unwrap()
        user ?: throw UserNotFoundException("movie not found")

        val movie = videoRepository.findById(order.movieId.toLong()).unwrap()
        movie ?: throw MovieNotFoundException("movie not found")

        if (user.balance - movie.cost < 0) throw NotEnoughBalanceException("Not enough money to order movie")
        val query = entityManager.createQuery(
            "UPDATE UserEntity user SET user.balance = user.balance - :movieCost "
                    + "WHERE user.id = :id"
        )
        query.setParameter("movieCost", movie.cost)
        query.setParameter("id", userId.toLong())
        query.executeUpdate()
        val orderEntity = orderRepository.save(OrderEntity(user = user, video = movie))
        return Order(orderEntity.id.toString(), order.movieId)
    }

    fun getOrder(userId: String, id: String): Any {
        val order = orderRepository.findById(id.toLong()).unwrap()
        order ?: throw OrderNotFoundException("order not found")
        if (order.user.id != userId.toLong()) throw NotFoundException("order not found")

        return Order(order.id.toString(), order.video.id.toString())
    }
}