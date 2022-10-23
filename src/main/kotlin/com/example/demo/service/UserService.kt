package com.example.demo.service

import com.example.demo.User
import com.example.demo.UserProfile
import com.example.demo.dao.UserEntity
import com.example.demo.dao.UserRepository
import com.example.demo.web.UserNotFoundException
import org.springframework.stereotype.Service
import java.util.*
import javax.annotation.PostConstruct
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Service
class UserService(
    val userRepository: UserRepository, val entityManager: EntityManager
) {
    @PostConstruct
    fun createDefaultUsers() {
        userRepository.saveAllAndFlush(
            listOf(
                UserEntity(login = "lb", firstName = "liza", secondName = "Bel", balance = 1000.0),
                UserEntity(login = "Ann92",  firstName = "Anna", secondName = "Nowak", balance = 200.0),
            )
        )
    }

    fun getUserProfile(id: String): UserProfile {
        val userProfile = userRepository.findById(id.toLong())
        return userProfile.unwrap()?.let { pr -> UserProfile(id, pr.login, pr.balance, listOf()) }
            ?: throw UserNotFoundException("user not found")
    }

    fun getUsers(): List<User> = userRepository.findAll().map { User(it.id.toString(), it.login) }

    fun getBalance(id: String): Double = userRepository.findBalanceById(id.toLong())

    @Transactional
    fun increaseBalance(
        id: String, amount: Double
    ): Boolean {
        val query = entityManager.createQuery(
            "UPDATE UserEntity user SET user.balance = user.balance + :amount " + "WHERE user.id = :id"
        )
        query.setParameter("amount", amount)
        query.setParameter("id", id.toLong())
        val rowsUpdated: Int = query.executeUpdate()
        return rowsUpdated > 1
    }
}

fun <T> Optional<T>.unwrap(): T? = orElse(null)