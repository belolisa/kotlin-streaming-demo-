package com.example.demo.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val login: String,
    val firstName: String?,
    val secondName: String?,
    val balance: Double = 10000.0,
)
