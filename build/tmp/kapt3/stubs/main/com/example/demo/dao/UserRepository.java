package com.example.demo.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0003H\'J\u001c\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/demo/dao/UserRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/example/demo/dao/UserEntity;", "", "findBalanceById", "", "id", "findByLoginEquals", "", "name", "", "demo"})
public abstract interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<com.example.demo.dao.UserEntity, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.util.List<com.example.demo.dao.UserEntity> findByLoginEquals(@org.jetbrains.annotations.Nullable
    java.lang.String name);
    
    @org.springframework.data.jpa.repository.Query(value = "SELECT balance from UserEntity WHERE id= :id")
    public abstract double findBalanceById(@org.springframework.data.repository.query.Param(value = "id")
    long id);
}