package com.example.acapplication.model.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "payment", foreignKeys = {@androidx.room.ForeignKey(entity = com.example.acapplication.model.entity.DailyDetailsEntity.class, childColumns = {"dailyDetailsId"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/example/acapplication/model/entity/PaymentEntity;", "Ljava/io/Serializable;", "name", "", "totalMoney", "", "notice", "clientId", "paymentState", "", "(Ljava/lang/String;ILjava/lang/String;IC)V", "getClientId", "()I", "id", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNotice", "setNotice", "getPaymentState", "()C", "getTotalMoney", "setTotalMoney", "(I)V", "app_debug"})
public final class PaymentEntity implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @androidx.room.ColumnInfo(name = "totalMoney")
    private int totalMoney;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "notice")
    private java.lang.String notice;
    @androidx.room.ColumnInfo(name = "dailyDetailsId")
    private final int clientId = 0;
    @androidx.room.ColumnInfo(name = "PaymentState")
    private final char paymentState = '\u0000';
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer id;
    
    public PaymentEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int totalMoney, @org.jetbrains.annotations.NotNull()
    java.lang.String notice, int clientId, char paymentState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTotalMoney() {
        return 0;
    }
    
    public final void setTotalMoney(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotice() {
        return null;
    }
    
    public final void setNotice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getClientId() {
        return 0;
    }
    
    public final char getPaymentState() {
        return '\u0000';
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}