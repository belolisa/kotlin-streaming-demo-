package com.example.demo

import com.example.demo.service.OrderService
import com.example.demo.service.UserService
import com.example.demo.web.InconsistentStateException
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/users")
class UserResource(
    val userService: UserService,
    val orderService: OrderService,
) {
    @GetMapping
    fun getAllUsersByPage() = userService.getUsers()

    @GetMapping("/{id}/profile")
    fun getUserProfile(@PathVariable id: String): UserProfile = userService.getUserProfile(id)


    @GetMapping("/{id}/balance")
    fun getUserBalance(@PathVariable id: String): Double = userService.getBalance(id)

    @PutMapping("/{id}/balance")
    fun increaseBalance(
        @PathVariable id: String,
        @RequestBody amount: Double
    ): Boolean {
        if (amount <= 0.5) {
            throw InconsistentStateException("Incorrect amount")
        }
        return userService.increaseBalance(id, amount)
    }

    @GetMapping("/{userId}/orders/{id}")
    fun getOrder(
        @PathVariable userId: String,
        @PathVariable id: String
    ) = orderService.getOrder(userId, id)

    @PostMapping("/{userId}/orders")
    fun createOrder(
        @PathVariable userId: String,
        @RequestBody order: Order
    ) = orderService.createOrder(userId, order)
}

data class User(val id: String?, val name: String)

data class UserProfile(
    val id: String?,
    val name: String,
    val balance: Double,
    val orders: List<Order>?
)

data class Order(
    val id: String?,
    val movieId: String
)



