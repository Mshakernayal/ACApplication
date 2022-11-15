package com.example.acapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0011\u0010\u001d\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/acapplication/viewmodel/AddSpendViewModel;", "Landroidx/lifecycle/ViewModel;", "spendRepository", "Lcom/example/acapplication/repository/SpendRepository;", "dailyDetailsRepository", "Lcom/example/acapplication/repository/DailyDetailsRepository;", "clientRepository", "Lcom/example/acapplication/repository/ClientRepository;", "(Lcom/example/acapplication/repository/SpendRepository;Lcom/example/acapplication/repository/DailyDetailsRepository;Lcom/example/acapplication/repository/ClientRepository;)V", "getClientRepository", "()Lcom/example/acapplication/repository/ClientRepository;", "getDailyDetailsRepository", "()Lcom/example/acapplication/repository/DailyDetailsRepository;", "getSpendRepository", "()Lcom/example/acapplication/repository/SpendRepository;", "deleteDailyDetails", "Lkotlinx/coroutines/Job;", "dailyDetailsEntity", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "deleteSpend", "spendEntity", "Lcom/example/acapplication/model/entity/SpendEntity;", "getAllNameClient", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastDailyDetailsId", "Landroidx/lifecycle/MutableLiveData;", "", "getMaxDailyDetails", "getSpendByDailyDetailsId", "dailyDetailsId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDailyDetails", "insertSpend", "updateDailyDetails", "updateSpend", "app_debug"})
public final class AddSpendViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.SpendRepository spendRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.ClientRepository clientRepository = null;
    
    public AddSpendViewModel(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.SpendRepository spendRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.SpendRepository getSpendRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.DailyDetailsRepository getDailyDetailsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.ClientRepository getClientRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertSpend(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.SpendEntity spendEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteSpend(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.SpendEntity spendEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateSpend(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.SpendEntity spendEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSpendByDailyDetailsId(int dailyDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.acapplication.model.entity.SpendEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertDailyDetails(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity dailyDetailsEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteDailyDetails(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity dailyDetailsEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateDailyDetails(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity dailyDetailsEntity) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllNameClient(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        return null;
    }
}