package com.example.acapplication.viewmodel.viewmodelfactory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ-\u0010\u000f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/acapplication/viewmodel/viewmodelfactory/InvoiceViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoiceRepository", "Lcom/example/acapplication/repository/InvoiceRepository;", "dailyDetailsRepository", "Lcom/example/acapplication/repository/DailyDetailsRepository;", "clientRepository", "Lcom/example/acapplication/repository/ClientRepository;", "(Lcom/example/acapplication/repository/InvoiceRepository;Lcom/example/acapplication/repository/DailyDetailsRepository;Lcom/example/acapplication/repository/ClientRepository;)V", "getClientRepository", "()Lcom/example/acapplication/repository/ClientRepository;", "getDailyDetailsRepository", "()Lcom/example/acapplication/repository/DailyDetailsRepository;", "getInvoiceRepository", "()Lcom/example/acapplication/repository/InvoiceRepository;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class InvoiceViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.InvoiceRepository invoiceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.repository.ClientRepository clientRepository = null;
    
    public InvoiceViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.InvoiceRepository invoiceRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.repository.InvoiceRepository getInvoiceRepository() {
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
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.viewmodel.CreationExtras extras) {
        return null;
    }
}