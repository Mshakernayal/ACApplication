package com.example.acapplication.model.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "invoice", foreignKeys = {@androidx.room.ForeignKey(entity = com.example.acapplication.model.entity.DailyDetailsEntity.class, childColumns = {"dailyDetailsId"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000eR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u001fR\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015\u00a8\u0006*"}, d2 = {"Lcom/example/acapplication/model/entity/InvoiceEntity;", "Ljava/io/Serializable;", "name", "", "itemType", "number", "", "meter", "price", "spend", "notice", "invoiceState", "", "dailyDetailsId", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;CI)V", "getDailyDetailsId", "()I", "id", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInvoiceState", "()C", "getItemType", "()Ljava/lang/String;", "setItemType", "(Ljava/lang/String;)V", "getMeter", "setMeter", "(I)V", "getName", "setName", "getNotice", "setNotice", "getNumber", "setNumber", "getPrice", "setPrice", "getSpend", "setSpend", "app_debug"})
public final class InvoiceEntity implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "itemType")
    private java.lang.String itemType;
    @androidx.room.ColumnInfo(name = "number")
    private int number;
    @androidx.room.ColumnInfo(name = "meter")
    private int meter;
    @androidx.room.ColumnInfo(name = "price")
    private int price;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "spend")
    private java.lang.Integer spend;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "notice")
    private java.lang.String notice;
    @androidx.room.ColumnInfo(name = "invoiceState")
    private final char invoiceState = '\u0000';
    @androidx.room.ColumnInfo(name = "dailyDetailsId")
    private final int dailyDetailsId = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer id;
    
    public InvoiceEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String itemType, int number, int meter, int price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer spend, @org.jetbrains.annotations.NotNull()
    java.lang.String notice, char invoiceState, int dailyDetailsId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemType() {
        return null;
    }
    
    public final void setItemType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getNumber() {
        return 0;
    }
    
    public final void setNumber(int p0) {
    }
    
    public final int getMeter() {
        return 0;
    }
    
    public final void setMeter(int p0) {
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public final void setPrice(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSpend() {
        return null;
    }
    
    public final void setSpend(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotice() {
        return null;
    }
    
    public final void setNotice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final char getInvoiceState() {
        return '\u0000';
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