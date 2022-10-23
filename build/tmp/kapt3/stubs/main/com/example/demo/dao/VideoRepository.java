package com.example.demo.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/example/demo/dao/VideoRepository;", "Lorg/springframework/data/repository/PagingAndSortingRepository;", "Lcom/example/demo/dao/VideoEntity;", "", "findAllByNameContaining", "Lorg/springframework/data/domain/Page;", "name", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "findByNameEquals", "", "demo"})
public abstract interface VideoRepository extends org.springframework.data.repository.PagingAndSortingRepository<com.example.demo.dao.VideoEntity, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    public abstract org.springframework.data.domain.Page<com.example.demo.dao.VideoEntity> findAllByNameContaining(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.util.List<com.example.demo.dao.VideoEntity> findByNameEquals(@org.jetbrains.annotations.Nullable
    java.lang.String name);
}