package com.example.demo.web


import com.example.demo.Video
import com.example.demo.VideoDetails
import com.example.demo.dao.VideoEntity
import com.example.demo.dao.VideoRepository
import com.fasterxml.jackson.databind.JsonNode
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.tuple
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.core.ParameterizedTypeReference
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class VideoResourceIntegrationTest(
    @Autowired val restTemplate: TestRestTemplate,
    @Autowired val videoRepository: VideoRepository
) {
    @BeforeAll
    fun init() {
        videoRepository.saveAll(
            listOf(
                VideoEntity(
                    name = "A film",
                    description = "AAA - description",
                    cost = 100.0,
                    rating = 8.50f,
                    yearOfIssue = 1994
                ),
                VideoEntity(
                    name = "B film",
                    description = "bbbb",
                    cost = 1.0,
                    rating = 8.90f,
                    yearOfIssue = 1994
                ),
                VideoEntity(
                    name = "Y",
                    description = "foo",
                    cost = 8.0,
                    rating = 9.90f,
                    yearOfIssue = 1994
                ),
            )
        )
    }

    @Test
    fun `Assert movie list content default paging and sorting`() {
        val movies = restTemplate.exchange(
            "/movies",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<RestResponsePage<Video>>() {},
        )
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.body!!.totalElements).isEqualTo(5)
        assertThat(movies.body!!.content).extracting("name")
            .containsExactlyInAnyOrder("Y", "Pulp Fiction", "Mulholland Dr.")
    }

    @Test
    fun `Assert movie list content with sorting and first page`() {
        val movies = restTemplate.exchange(
            "/movies?sortBy=rating",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<RestResponsePage<Video>>() {}
        )

        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.body!!.totalElements).isEqualTo(5)
        assertThat(movies.body!!.content).extracting("name")
            .containsExactlyInAnyOrder("Y", "B film", "Pulp Fiction")

    }

    @Test
    fun `Assert movie list content with soring and next page`() {
        val movies = restTemplate.exchange(
            "/movies?sortBy=rating&page=1",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<RestResponsePage<Video>>() {},
        )
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.body!!.totalElements).isEqualTo(5)
        assertThat(movies.body!!.content).extracting("name")
            .containsExactlyInAnyOrder("A film", "Mulholland Dr.")
    }

    @Test
    fun `Assert movie list content asc sorting`() {
        val movies = restTemplate.exchange(
            "/movies?sortDir=asc",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<RestResponsePage<Video>>() {},
        )
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.body!!.totalElements).isEqualTo(5)
        assertThat(movies.body!!.content).extracting("name")
            .containsExactlyInAnyOrder("A film", "B film", "Mulholland Dr.")
    }

    @Test
    fun `Assert movie list content search be name`() {
        val movies = restTemplate.exchange(
            "/movies?name=film&sortDir=desc",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<RestResponsePage<Video>>() {},
        )
        assertThat(movies.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movies.body!!.totalElements).isEqualTo(2)
        assertThat(movies.body!!.content).extracting("name")
            .containsExactlyInAnyOrder("B film", "A film")
    }

    @Test
    fun `Assert movie user profile by id`() {
        val id = videoRepository.findByNameEquals("Pulp Fiction")?.first()?.id
        val entity = restTemplate.getForEntity<VideoDetails>("/movies/${id}")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body?.name).isEqualTo("Pulp Fiction")
        assertThat(entity.body?.cost).isEqualTo(5.0)
        assertThat(entity.body?.yearOfIssue).isEqualTo(1994)
        assertThat(entity.body?.rating).isEqualTo(8.90f)
    }

    @Test
    fun `Assert movie not found by id`() {
        val entity = restTemplate.getForEntity<String>("/movies/100")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.NOT_FOUND)
    }

    @Test
    fun `Assert add movie`() {
        val initialNewMovies = videoRepository.findByNameEquals("newMovie")
        assertThat(initialNewMovies?.size).isEqualTo(0)

        val videoDetails = VideoDetails(null, "newMovie", "description", 1900, 0.0f, 20.0)
        val postForEntity = restTemplate.postForEntity<String>("/movies", videoDetails, null, String)

        assertThat(postForEntity.statusCode).isEqualTo(HttpStatus.OK)
        val newMovies = videoRepository.findByNameEquals("newMovie")
        assertThat(newMovies?.size).isEqualTo(1)
        assertThat(newMovies).extracting("name", "description", "cost")
            .contains(tuple("newMovie", "description", 20.0))
        videoRepository.deleteById(newMovies?.get(0)!!.id)
    }

    internal class RestResponsePage<T> : PageImpl<T> {
        constructor(
            content: List<T>?,
            number: Int,
            size: Int,
            totalElements: Long?,
            pageable: JsonNode?,
            last: Boolean,
            totalPages: Int,
            sort: JsonNode?,
            first: Boolean,
            numberOfElements: Int
        ) : super(
            content ?: listOf(), PageRequest.of(number, size), totalElements!!
        )

        companion object {
            private const val serialVersionUID = 3248189030448292002L
        }
    }
}
