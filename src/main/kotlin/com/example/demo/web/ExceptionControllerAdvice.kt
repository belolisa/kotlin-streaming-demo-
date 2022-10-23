package com.example.demo.web

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionControllerAdvice {
    @ExceptionHandler
    fun handleUserNotFoundException(ex: UserNotFoundException): ResponseEntity<ErrorMessageModel> {
        val errorMessage = ErrorMessageModel(HttpStatus.NOT_FOUND.value(), ex.message)
        return ResponseEntity(errorMessage, HttpStatus.NOT_FOUND)
    }
    @ExceptionHandler
    fun handleMovieNotFoundException(ex: MovieNotFoundException): ResponseEntity<ErrorMessageModel> {
        val errorMessage = ErrorMessageModel(HttpStatus.NOT_FOUND.value(), ex.message)
        return ResponseEntity(errorMessage, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler
    fun orderNotFoundException(ex: OrderNotFoundException): ResponseEntity<ErrorMessageModel> {
        val errorMessage = ErrorMessageModel(HttpStatus.NOT_FOUND.value(), ex.message)
        return ResponseEntity(errorMessage, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler
    fun handleInconsistentStateException(ex: InconsistentStateException): ResponseEntity<ErrorMessageModel> {
        val errorMessage = ErrorMessageModel(HttpStatus.BAD_REQUEST.value(), ex.message)
        return ResponseEntity(errorMessage, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleInconsistentStateException(ex: NotEnoughBalanceException): ResponseEntity<ErrorMessageModel> {
        val errorMessage = ErrorMessageModel(HttpStatus.BAD_REQUEST.value(), ex.message)
        return ResponseEntity(errorMessage, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleInconsistentStateException(ex: IllegalArgumentException): ResponseEntity<ErrorMessageModel> {
        val errorMessage = ErrorMessageModel(HttpStatus.BAD_REQUEST.value(), ex.message)
        return ResponseEntity(errorMessage, HttpStatus.BAD_REQUEST)
    }
}

class ErrorMessageModel(
    var status: Int? = null,
    var message: String? = null
)

class UserNotFoundException(message: String) : RuntimeException(message)

class MovieNotFoundException(message: String) : RuntimeException(message)

class OrderNotFoundException(message: String) : RuntimeException(message)

class InconsistentStateException(message: String) : RuntimeException(message)

class NotEnoughBalanceException(message: String) : RuntimeException(message)

class NotFoundException(message: String) : RuntimeException(message)


