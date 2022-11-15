package com.example.acapplication.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J0\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J \u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007\u00a8\u0006!"}, d2 = {"Lcom/example/acapplication/data/di/AddSpendApplicationModule;", "", "()V", "provideAcDataBase", "Lcom/example/acapplication/model/database/AcDataBase;", "context", "Landroid/content/Context;", "provideAddSpendViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/AddSpendViewModelFactory;", "spendRepository", "Lcom/example/acapplication/repository/SpendRepository;", "dailyDetailsRepository", "Lcom/example/acapplication/repository/DailyDetailsRepository;", "clientRepository", "Lcom/example/acapplication/repository/ClientRepository;", "provideClientRepository", "dataBase", "provideClientViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/ClientViewModelFactory;", "provideDailyDetailsRepository", "provideDailyDetailsViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/DailyDetailsViewModelFactory;", "invoiceRepository", "Lcom/example/acapplication/repository/InvoiceRepository;", "paymentRepository", "Lcom/example/acapplication/repository/PaymentRepository;", "provideInvoiceRepository", "provideInvoiceViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/InvoiceViewModelFactory;", "providePaymentRepository", "providePaymentViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/PaymentViewModelFactory;", "provideSpendRepository", "app_debug"})
@dagger.Module()
public final class AddSpendApplicationModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.acapplication.data.di.AddSpendApplicationModule INSTANCE = null;
    
    private AddSpendApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.model.database.AcDataBase provideAcDataBase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.repository.DailyDetailsRepository provideDailyDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.database.AcDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.repository.InvoiceRepository provideInvoiceRepository(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.database.AcDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.repository.PaymentRepository providePaymentRepository(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.database.AcDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.repository.SpendRepository provideSpendRepository(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.database.AcDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.repository.ClientRepository provideClientRepository(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.database.AcDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.viewmodel.viewmodelfactory.DailyDetailsViewModelFactory provideDailyDetailsViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.InvoiceRepository invoiceRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.PaymentRepository paymentRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.SpendRepository spendRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.viewmodel.viewmodelfactory.InvoiceViewModelFactory provideInvoiceViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.InvoiceRepository invoiceRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.viewmodel.viewmodelfactory.PaymentViewModelFactory providePaymentViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.PaymentRepository paymentRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.viewmodel.viewmodelfactory.AddSpendViewModelFactory provideAddSpendViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.SpendRepository spendRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory provideClientViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    com.example.acapplication.repository.DailyDetailsRepository dailyDetailsRepository) {
        return null;
    }
}