package com.example.acapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0 0\u001fJ\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u001fJ\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020%0(J\u0019\u0010)\u001a\u00020*2\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010+\u001a\u00020,2\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u000e\u0010-\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/example/acapplication/viewmodel/DailyDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "dailyDetailsRepository", "Lcom/example/acapplication/repository/DailyDetailsRepository;", "clientRepository", "Lcom/example/acapplication/repository/ClientRepository;", "invoiceRepository", "Lcom/example/acapplication/repository/InvoiceRepository;", "paymentRepository", "Lcom/example/acapplication/repository/PaymentRepository;", "spendRepository", "Lcom/example/acapplication/repository/SpendRepository;", "(Lcom/example/acapplication/repository/DailyDetailsRepository;Lcom/example/acapplication/repository/ClientRepository;Lcom/example/acapplication/repository/InvoiceRepository;Lcom/example/acapplication/repository/PaymentRepository;Lcom/example/acapplication/repository/SpendRepository;)V", "getClientRepository", "()Lcom/example/acapplication/repository/ClientRepository;", "getDailyDetailsRepository", "()Lcom/example/acapplication/repository/DailyDetailsRepository;", "getInvoiceRepository", "()Lcom/example/acapplication/repository/InvoiceRepository;", "getPaymentRepository", "()Lcom/example/acapplication/repository/PaymentRepository;", "getSpendRepository", "()Lcom/example/acapplication/repository/SpendRepository;", "deleteClient", "Lkotlinx/coroutines/Job;", "clientEntity", "Lcom/example/acapplication/model/entity/ClientEntity;", "deleteDailyDetails", "dailyDetailsEntity", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "getAllClient", "Landroidx/lifecycle/LiveData;", "", "getAllDailyDetails", "getInvoiceByDailyDetailsId", "Lcom/example/acapplication/model/entity/InvoiceEntity;", "dailyDetailsId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "getPaymentByDailyDetailsId", "Lcom/example/acapplication/model/entity/PaymentEntity;", "getSpendByDailyDetailsId", "Lcom/example/acapplication/model/entity/SpendEntity;", "insertDailyDetails", "updateDailyDetails", "app_debug"})
public final class DailyDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.ClientRepository clientRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.InvoiceRepository invoiceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.PaymentRepository paymentRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.SpendRepository spendRepository = null;
    
    public DailyDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.InvoiceRepository invoiceRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.PaymentRepository paymentRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.SpendRepository spendRepository) {
        super();
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
    public final com.example.acapplication.repository.InvoiceRepository getInvoiceRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.PaymentRepository getPaymentRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.SpendRepository getSpendRepository() {
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
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acapplication.model.entity.DailyDetailsEntity>> getAllDailyDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getInvoiceByDailyDetailsId(int dailyDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.acapplication.model.entity.InvoiceEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSpendByDailyDetailsId(int dailyDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.acapplication.model.entity.SpendEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acapplication.model.entity.ClientEntity>> getAllClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteClient(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.ClientEntity clientEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPaymentByDailyDetailsId(int dailyDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.acapplication.model.entity.PaymentEntity> continuation) {
        return null;
    }
}