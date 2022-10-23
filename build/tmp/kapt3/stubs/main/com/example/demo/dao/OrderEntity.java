package com.example.demo.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/demo/dao/OrderEntity;", "", "id", "", "user", "Lcom/example/demo/dao/UserEntity;", "video", "Lcom/example/demo/dao/VideoEntity;", "(JLcom/example/demo/dao/UserEntity;Lcom/example/demo/dao/VideoEntity;)V", "getId", "()J", "getUser", "()Lcom/example/demo/dao/UserEntity;", "getVideo", "()Lcom/example/demo/dao/VideoEntity;", "demo"})
@javax.persistence.Table
@javax.persistence.Entity
public final class OrderEntity {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.JoinColumn(name = "user_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private final com.example.demo.dao.UserEntity user = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.JoinColumn(name = "video_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private final com.example.demo.dao.VideoEntity video = null;
    
    public OrderEntity(long id, @org.jetbrains.annotations.NotNull
    com.example.demo.dao.UserEntity user, @org.jetbrains.annotations.NotNull
    com.example.demo.dao.VideoEntity video) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.demo.dao.UserEntity getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.demo.dao.VideoEntity getVideo() {
        return null;
    }
}