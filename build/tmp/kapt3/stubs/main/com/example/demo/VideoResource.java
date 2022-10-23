package com.example.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0017J\u0012\u0010\u0016\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u0012H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/example/demo/VideoResource;", "", "videoService", "Lcom/example/demo/service/VideoService;", "videoProperties", "Lcom/example/demo/web/VideoProperties;", "(Lcom/example/demo/service/VideoService;Lcom/example/demo/web/VideoProperties;)V", "getVideoProperties", "()Lcom/example/demo/web/VideoProperties;", "getVideoService", "()Lcom/example/demo/service/VideoService;", "addVideo", "Lcom/example/demo/Video;", "movie", "Lcom/example/demo/VideoDetails;", "getAllVideosByPageAndSorting", "Lorg/springframework/data/domain/Page;", "page", "", "sortBy", "sortDir", "name", "getVideoDetails", "id", "demo"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/videos"})
@org.springframework.web.bind.annotation.RestController
public class VideoResource {
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.service.VideoService videoService = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.demo.web.VideoProperties videoProperties = null;
    
    public VideoResource(@org.jetbrains.annotations.NotNull
    com.example.demo.service.VideoService videoService, @org.jetbrains.annotations.NotNull
    com.example.demo.web.VideoProperties videoProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.service.VideoService getVideoService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.demo.web.VideoProperties getVideoProperties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public org.springframework.data.domain.Page<com.example.demo.Video> getAllVideosByPageAndSorting(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.RequestParam
    java.lang.String page, @org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.RequestParam
    java.lang.String sortBy, @org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.RequestParam
    java.lang.String sortDir, @org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.RequestParam
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public com.example.demo.VideoDetails getVideoDetails(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public com.example.demo.Video addVideo(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.example.demo.VideoDetails movie) {
        return null;
    }
}