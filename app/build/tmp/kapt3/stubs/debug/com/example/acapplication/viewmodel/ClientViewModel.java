package com.example.acapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u0010J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/acapplication/viewmodel/ClientViewModel;", "Landroidx/lifecycle/ViewModel;", "clientRepository", "Lcom/example/acapplication/repository/ClientRepository;", "dailyDetailsRepository", "Lcom/example/acapplication/repository/DailyDetailsRepository;", "(Lcom/example/acapplication/repository/ClientRepository;Lcom/example/acapplication/repository/DailyDetailsRepository;)V", "getClientRepository", "()Lcom/example/acapplication/repository/ClientRepository;", "getDailyDetailsRepository", "()Lcom/example/acapplication/repository/DailyDetailsRepository;", "deleteClientName", "Lkotlinx/coroutines/Job;", "clientEntity", "Lcom/example/acapplication/model/entity/ClientEntity;", "getAllClient", "Landroidx/lifecycle/LiveData;", "", "getAllDailyDetailsByByClientId", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "clientId", "", "getMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "insertClientName", "updateClientName", "app_debug"})
public final class ClientViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.ClientRepository clientRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository = null;
    
    public ClientViewModel(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.ClientRepository getClientRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.DailyDetailsRepository getDailyDetailsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertClientName(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.ClientEntity clientEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteClientName(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.ClientEntity clientEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateClientName(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.ClientEntity clientEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acapplication.model.entity.ClientEntity>> getAllClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acapplication.model.entity.DailyDetailsEntity>> getAllDailyDetailsByByClientId(int clientId) {
        return null;
    }
}