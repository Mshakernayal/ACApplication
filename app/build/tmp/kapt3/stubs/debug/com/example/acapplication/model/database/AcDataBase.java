package com.example.acapplication.model.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.acapplication.model.entity.ClientEntity.class, com.example.acapplication.model.entity.DailyDetailsEntity.class, com.example.acapplication.model.entity.InvoiceEntity.class, com.example.acapplication.model.entity.PaymentEntity.class, com.example.acapplication.model.entity.SpendEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/example/acapplication/model/database/AcDataBase;", "Landroidx/room/RoomDatabase;", "()V", "getClientDao", "Lcom/example/acapplication/model/dao/ClientDao;", "getDailyDetailsDao", "Lcom/example/acapplication/model/dao/DailyDetailsDao;", "getInvoiceDao", "Lcom/example/acapplication/model/dao/InvoiceDao;", "getPaymentDao", "Lcom/example/acapplication/model/dao/PaymentDao;", "getSpendDao", "Lcom/example/acapplication/model/dao/SpendDao;", "app_debug"})
public abstract class AcDataBase extends androidx.room.RoomDatabase {
    
    public AcDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.acapplication.model.dao.ClientDao getClientDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.acapplication.model.dao.DailyDetailsDao getDailyDetailsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.acapplication.model.dao.InvoiceDao getInvoiceDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.acapplication.model.dao.PaymentDao getPaymentDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.acapplication.model.dao.SpendDao getSpendDao();
}