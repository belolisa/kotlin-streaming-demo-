package com.example.demo.service

import com.example.demo.Video
import com.example.demo.VideoDetails
import com.example.demo.dao.VideoEntity
import com.example.demo.dao.VideoRepository
import com.example.demo.web.MovieNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class VideoService(val videoRepository: VideoRepository) {

    @PostConstruct
    fun createDefaultMoviesCatalog() {
        videoRepository.saveAll(
            listOf(
                VideoEntity(
                    name = "Pulp Fiction",
                    description = "Just because you are a character doesn't mean you have character",
                    cost = 5.0,
                    rating = 8.90f,
                    yearOfIssue = 1994
                ),
                VideoEntity(
                    name = "Mulholland Dr.",
                    description = "A random accident saves the girl from death, but takes away her memory. Thriller by David Lynch about finding your own \"I\"",
                    cost = 10.0,
                    rating = 7.90f,
                    yearOfIssue = 2001
                ),
            )
        )
    }

    fun getVideos(pageRequest: PageRequest, searchByNameString: String?): Page<Video> {
        return searchByNameString?.let {
            videoRepository.findAllByNameContaining(searchByNameString, pageRequest)
                .map { Video(it.id.toString(), it.name) }
        }
            ?: videoRepository.findAll(pageRequest)
                .map { Video(it.id.toString(), it.name) }
    }

    fun getMovieDetailed(id: String): VideoDetails {
        val movieEntity = videoRepository.findById(id.toLong())
        return movieEntity.unwrap()
            ?.let { ent -> VideoDetails(id, ent.name, ent.description, ent.yearOfIssue, ent.rating, ent.cost) }
            ?: throw MovieNotFoundException("movie not found")
    }

    fun addMovie(movie: VideoDetails): Video {
        val videoEntity = VideoEntity(
            name = movie.name,
            description = movie.description,
            cost = movie.cost,
            rating = movie.rating,
            yearOfIssue = movie.yearOfIssue
        )
        val newMovie = videoRepository.save(videoEntity)
        return Video(newMovie.id.toString(), newMovie.name)
    }
}