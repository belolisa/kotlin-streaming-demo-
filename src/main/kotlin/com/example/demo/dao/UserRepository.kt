package com.example.demo.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface UserRepository : JpaRepository<UserEntity, Long> {

    fun findByLoginEquals(name: String?): List<UserEntity?>?

    @Query("SELECT balance from UserEntity WHERE id= :id")
    fun findBalanceById(@Param("id")id: Long): Double

}