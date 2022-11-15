package com.example.acapplication.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u0010J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u00102\u0006\u0010\u0013\u001a\u00020\tJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0011\u0010\u0015\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/acapplication/repository/DailyDetailsRepository;", "", "dataBase", "Lcom/example/acapplication/model/database/AcDataBase;", "(Lcom/example/acapplication/model/database/AcDataBase;)V", "getDataBase", "()Lcom/example/acapplication/model/database/AcDataBase;", "lastDailyDetailsId", "Landroidx/lifecycle/MutableLiveData;", "", "delete", "", "dailyDetailsEntity", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "(Lcom/example/acapplication/model/entity/DailyDetailsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDailyDetails", "Landroidx/lifecycle/LiveData;", "", "getAllDailyDetailsByClientId", "clientId", "getLastDailyDetailsId", "getMaxDailyDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "update", "app_debug"})
public final class DailyDetailsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.model.database.AcDataBase dataBase = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> lastDailyDetailsId;
    
    public DailyDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.database.AcDataBase dataBase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.model.database.AcDataBase getDataBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity dailyDetailsEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity dailyDetailsEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity dailyDetailsEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acapplication.model.entity.DailyDetailsEntity>> getAllDailyDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLastDailyDetailsId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMaxDailyDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acapplication.model.entity.DailyDetailsEntity>> getAllDailyDetailsByClientId(int clientId) {
        return null;
    }
}