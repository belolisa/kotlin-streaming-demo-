package com.example.demo.web;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0017J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\tj\u0002`\nH\u0017J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\fH\u0017J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000eH\u0017J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0010H\u0017\u00a8\u0006\u0011"}, d2 = {"Lcom/example/demo/web/ExceptionControllerAdvice;", "", "()V", "handleInconsistentStateException", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/demo/web/ErrorMessageModel;", "ex", "Lcom/example/demo/web/InconsistentStateException;", "Lcom/example/demo/web/NotEnoughBalanceException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "handleMovieNotFoundException", "Lcom/example/demo/web/MovieNotFoundException;", "handleUserNotFoundException", "Lcom/example/demo/web/UserNotFoundException;", "orderNotFoundException", "Lcom/example/demo/web/OrderNotFoundException;", "demo"})
@org.springframework.web.bind.annotation.ControllerAdvice
public class ExceptionControllerAdvice {
    
    public ExceptionControllerAdvice() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler
    public org.springframework.http.ResponseEntity<com.example.demo.web.ErrorMessageModel> handleUserNotFoundException(@org.jetbrains.annotations.NotNull
    com.example.demo.web.UserNotFoundException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler
    public org.springframework.http.ResponseEntity<com.example.demo.web.ErrorMessageModel> handleMovieNotFoundException(@org.jetbrains.annotations.NotNull
    com.example.demo.web.MovieNotFoundException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler
    public org.springframework.http.ResponseEntity<com.example.demo.web.ErrorMessageModel> orderNotFoundException(@org.jetbrains.annotations.NotNull
    com.example.demo.web.OrderNotFoundException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler
    public org.springframework.http.ResponseEntity<com.example.demo.web.ErrorMessageModel> handleInconsistentStateException(@org.jetbrains.annotations.NotNull
    com.example.demo.web.InconsistentStateException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler
    public org.springframework.http.ResponseEntity<com.example.demo.web.ErrorMessageModel> handleInconsistentStateException(@org.jetbrains.annotations.NotNull
    com.example.demo.web.NotEnoughBalanceException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler
    public org.springframework.http.ResponseEntity<com.example.demo.web.ErrorMessageModel> handleInconsistentStateException(@org.jetbrains.annotations.NotNull
    java.lang.IllegalArgumentException ex) {
        return null;
    }
}