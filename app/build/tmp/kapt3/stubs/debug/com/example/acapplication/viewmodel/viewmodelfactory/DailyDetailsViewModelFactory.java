package com.example.acapplication.viewmodel.viewmodelfactory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ-\u0010\u0017\u001a\u0002H\u0018\"\b\b\u0000\u0010\u0018*\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016\u00a2\u0006\u0002\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/example/acapplication/viewmodel/viewmodelfactory/DailyDetailsViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "dailyDetailsRepository", "Lcom/example/acapplication/repository/DailyDetailsRepository;", "clientRepository", "Lcom/example/acapplication/repository/ClientRepository;", "invoiceRepository", "Lcom/example/acapplication/repository/InvoiceRepository;", "paymentRepository", "Lcom/example/acapplication/repository/PaymentRepository;", "spendRepository", "Lcom/example/acapplication/repository/SpendRepository;", "(Lcom/example/acapplication/repository/DailyDetailsRepository;Lcom/example/acapplication/repository/ClientRepository;Lcom/example/acapplication/repository/InvoiceRepository;Lcom/example/acapplication/repository/PaymentRepository;Lcom/example/acapplication/repository/SpendRepository;)V", "getClientRepository", "()Lcom/example/acapplication/repository/ClientRepository;", "getDailyDetailsRepository", "()Lcom/example/acapplication/repository/DailyDetailsRepository;", "getInvoiceRepository", "()Lcom/example/acapplication/repository/InvoiceRepository;", "getPaymentRepository", "()Lcom/example/acapplication/repository/PaymentRepository;", "getSpendRepository", "()Lcom/example/acapplication/repository/SpendRepository;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class DailyDetailsViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
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
    
    public DailyDetailsViewModelFactory(@org.jetbrains.annotations.NotNull()
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
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.viewmodel.CreationExtras extras) {
        return null;
    }
}