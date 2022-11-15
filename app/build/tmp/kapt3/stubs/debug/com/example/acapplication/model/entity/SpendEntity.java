package com.example.acapplication.model.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "spend", foreignKeys = {@androidx.room.ForeignKey(entity = com.example.acapplication.model.entity.DailyDetailsEntity.class, childColumns = {"dailyDetailsId"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/acapplication/model/entity/SpendEntity;", "Ljava/io/Serializable;", "details", "", "totalMoney", "", "notice", "dailyDetailsId", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDailyDetailsId", "()I", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "id", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNotice", "setNotice", "getTotalMoney", "setTotalMoney", "(I)V", "app_debug"})
public final class SpendEntity implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "details")
    private java.lang.String details;
    @androidx.room.ColumnInfo(name = "totalMoney")
    private int totalMoney;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "notice")
    private java.lang.String notice;
    @androidx.room.ColumnInfo(name = "dailyDetailsId")
    private final int dailyDetailsId = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer id;
    
    public SpendEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String details, int totalMoney, @org.jetbrains.annotations.NotNull()
    java.lang.String notice, int dailyDetailsId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetails() {
        return null;
    }
    
    public final void setDetails(@org.jetbrains.annotations.NotNull()
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
    
    public final int getDailyDetailsId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}