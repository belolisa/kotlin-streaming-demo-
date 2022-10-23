package com.example.demo.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/example/demo/service/VideoService;", "", "videoRepository", "Lcom/example/demo/dao/VideoRepository;", "(Lcom/example/demo/dao/VideoRepository;)V", "getVideoRepository", "()Lcom/example/demo/dao/VideoRepository;", "addMovie", "Lcom/example/demo/Video;", "movie", "Lcom/example/demo/VideoDetails;", "createDefaultMoviesCatalog", "", "getMovieDetailed", "id", "", "getVideos", "Lorg/springframework/data/domain/Page;", "pageRequest", "Lorg/springframework/data/domain/PageRequest;", "searchByNameString", "demo"})
@org.springframework.stereotype.Service
public class VideoService {
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.dao.VideoRepository videoRepository = null;
    
    public VideoService(@org.jetbrains.annotations.NotNull
    com.example.demo.dao.VideoRepository videoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.dao.VideoRepository getVideoRepository() {
        return null;
    }
    
    @javax.annotation.PostConstruct
    public void createDefaultMoviesCatalog() {
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.domain.Page<com.example.demo.Video> getVideos(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.PageRequest pageRequest, @org.jetbrains.annotations.Nullable
    java.lang.String searchByNameString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.VideoDetails getMovieDetailed(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.Video addMovie(@org.jetbrains.annotations.NotNull
    com.example.demo.VideoDetails movie) {
        return null;
    }
}