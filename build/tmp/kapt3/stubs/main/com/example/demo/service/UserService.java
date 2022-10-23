package com.example.demo.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000eH\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/example/demo/service/UserService;", "", "userRepository", "Lcom/example/demo/dao/UserRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "(Lcom/example/demo/dao/UserRepository;Ljavax/persistence/EntityManager;)V", "getEntityManager", "()Ljavax/persistence/EntityManager;", "getUserRepository", "()Lcom/example/demo/dao/UserRepository;", "createDefaultUsers", "", "getBalance", "", "id", "", "getUserProfile", "Lcom/example/demo/UserProfile;", "getUsers", "", "Lcom/example/demo/User;", "increaseBalance", "", "amount", "demo"})
@org.springframework.stereotype.Service
public class UserService {
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.dao.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final javax.persistence.EntityManager entityManager = null;
    
    public UserService(@org.jetbrains.annotations.NotNull
    com.example.demo.dao.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.dao.UserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public javax.persistence.EntityManager getEntityManager() {
        return null;
    }
    
    @javax.annotation.PostConstruct
    public void createDefaultUsers() {
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.UserProfile getUserProfile(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.example.demo.User> getUsers() {
        return null;
    }
    
    public double getBalance(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return 0.0;
    }
    
    @javax.transaction.Transactional
    public boolean increaseBalance(@org.jetbrains.annotations.NotNull
    java.lang.String id, double amount) {
        return false;
    }
}