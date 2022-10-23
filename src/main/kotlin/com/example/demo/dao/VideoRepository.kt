package com.example.demo.dao

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository

interface VideoRepository : PagingAndSortingRepository<VideoEntity, Long> {
    fun findAllByNameContaining(name: String?, pageable: Pageable): Page<VideoEntity>
    fun findByNameEquals(name: String?): List<VideoEntity?>?

}