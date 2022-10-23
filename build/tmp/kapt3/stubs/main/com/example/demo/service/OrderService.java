package com.example.demo.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0017J\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/example/demo/service/OrderService;", "", "orderRepository", "Lcom/example/demo/dao/OrderRepository;", "userRepository", "Lcom/example/demo/dao/UserRepository;", "videoRepository", "Lcom/example/demo/dao/VideoRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "(Lcom/example/demo/dao/OrderRepository;Lcom/example/demo/dao/UserRepository;Lcom/example/demo/dao/VideoRepository;Ljavax/persistence/EntityManager;)V", "getEntityManager", "()Ljavax/persistence/EntityManager;", "getOrderRepository", "()Lcom/example/demo/dao/OrderRepository;", "getUserRepository", "()Lcom/example/demo/dao/UserRepository;", "getVideoRepository", "()Lcom/example/demo/dao/VideoRepository;", "createOrder", "Lcom/example/demo/Order;", "userId", "", "order", "getOrder", "id", "demo"})
@org.springframework.stereotype.Service
public class OrderService {
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.dao.OrderRepository orderRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.dao.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.dao.VideoRepository videoRepository = null;
    @org.jetbrains.annotations.NotNull
    private final javax.persistence.EntityManager entityManager = null;
    
    public OrderService(@org.jetbrains.annotations.NotNull
    com.example.demo.dao.OrderRepository orderRepository, @org.jetbrains.annotations.NotNull
    com.example.demo.dao.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.example.demo.dao.VideoRepository videoRepository, @org.jetbrains.annotations.NotNull
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.dao.OrderRepository getOrderRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.dao.UserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.dao.VideoRepository getVideoRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public javax.persistence.EntityManager getEntityManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    public com.example.demo.Order createOrder(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    com.example.demo.Order order) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.Object getOrder(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
}