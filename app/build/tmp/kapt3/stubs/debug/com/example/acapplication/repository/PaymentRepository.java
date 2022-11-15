package com.example.acapplication.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/acapplication/repository/PaymentRepository;", "", "dataBase", "Lcom/example/acapplication/model/database/AcDataBase;", "(Lcom/example/acapplication/model/database/AcDataBase;)V", "getDataBase", "()Lcom/example/acapplication/model/database/AcDataBase;", "delete", "", "paymentEntity", "Lcom/example/acapplication/model/entity/PaymentEntity;", "(Lcom/example/acapplication/model/entity/PaymentEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentByDailyDetailsId", "dailyDetailsId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "update", "app_debug"})
public final class PaymentRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.model.database.AcDataBase dataBase = null;
    
    public PaymentRepository(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.database.AcDataBase dataBase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.model.database.AcDataBase getDataBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.PaymentEntity paymentEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.PaymentEntity paymentEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.PaymentEntity paymentEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPaymentByDailyDetailsId(int dailyDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.acapplication.model.entity.PaymentEntity> continuation) {
        return null;
    }
}