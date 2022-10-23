package com.example.demo

import com.example.demo.service.VideoService
import com.example.demo.web.VideoProperties
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/videos")
class VideoResource(
    val videoService: VideoService,
    val videoProperties: VideoProperties
) {
    @GetMapping
    fun getAllVideosByPageAndSorting(
        @RequestParam page: String?,
        @RequestParam sortBy: String?,
        @RequestParam sortDir: String?,
        @RequestParam name: String?
    ): Page<Video> {
        return videoService.getVideos(
            PageRequest.of(
                page?.toInt() ?: 0,
                videoProperties.pageSize,
                Sort.by(
                    sortDir?.let { Sort.Direction.fromString(it) } ?: Sort.Direction.DESC,
                    sortBy ?: "name"
                )
            ), name
        )
    }

    @GetMapping("/{id}")
    fun getVideoDetails(@PathVariable id: String): VideoDetails = videoService.getMovieDetailed(id)

    @PostMapping("")
    fun addVideo(@RequestBody movie: VideoDetails) = videoService.addMovie(movie)
}

data class Video(val id: String?, val name: String)

data class VideoDetails(
    val id: String?,
    val name: String,
    val description: String,
    val yearOfIssue: Int,
    val rating: Float,
    val cost: Double
)
