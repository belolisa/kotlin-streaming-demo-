package com.example.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\fH\u0017J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0017J\u001c\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0014\u001a\u00020\u000eH\u0017J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0014\u001a\u00020\u000eH\u0017J\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0014\u001a\u00020\u000eH\u0017J\u001c\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\u0016H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/example/demo/UserResource;", "", "userService", "Lcom/example/demo/service/UserService;", "orderService", "Lcom/example/demo/service/OrderService;", "(Lcom/example/demo/service/UserService;Lcom/example/demo/service/OrderService;)V", "getOrderService", "()Lcom/example/demo/service/OrderService;", "getUserService", "()Lcom/example/demo/service/UserService;", "createOrder", "Lcom/example/demo/Order;", "userId", "", "order", "getAllUsersByPage", "", "Lcom/example/demo/User;", "getOrder", "id", "getUserBalance", "", "getUserProfile", "Lcom/example/demo/UserProfile;", "increaseBalance", "", "amount", "demo"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/users"})
@org.springframework.web.bind.annotation.RestController
public class UserResource {
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.service.UserService userService = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.service.OrderService orderService = null;
    
    public UserResource(@org.jetbrains.annotations.NotNull
    com.example.demo.service.UserService userService, @org.jetbrains.annotations.NotNull
    com.example.demo.service.OrderService orderService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.service.UserService getUserService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.service.OrderService getOrderService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.util.List<com.example.demo.User> getAllUsersByPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}/profile"})
    public com.example.demo.UserProfile getUserProfile(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}/balance"})
    public double getUserBalance(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String id) {
        return 0.0;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}/balance"})
    public boolean increaseBalance(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String id, @org.springframework.web.bind.annotation.RequestBody
    double amount) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{userId}/orders/{id}"})
    public java.lang.Object getOrder(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/{userId}/orders"})
    public com.example.demo.Order createOrder(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.demo.Order order) {
        return null;
    }
}