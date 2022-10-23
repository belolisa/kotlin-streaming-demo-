package com.example.demo.dao

import javax.persistence.*

@Entity
@Table
open class VideoEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    open val id: Long = 0,
    open val name: String,
    open val description: String = "Some description",
    open val cost: Double,
    open val yearOfIssue: Int,
    open val rating: Float,
    open val urlPath: String = "defaultPass"
)