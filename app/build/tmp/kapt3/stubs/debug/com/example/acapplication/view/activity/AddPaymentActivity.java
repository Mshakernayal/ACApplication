package com.example.acapplication.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020%H\u0002J\"\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0012\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J-\u00101\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u000204032\u0006\u00105\u001a\u000206H\u0016\u00a2\u0006\u0002\u00107R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00068"}, d2 = {"Lcom/example/acapplication/view/activity/AddPaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/acapplication/databinding/ActivityAddPaymentBinding;", "getBinding", "()Lcom/example/acapplication/databinding/ActivityAddPaymentBinding;", "setBinding", "(Lcom/example/acapplication/databinding/ActivityAddPaymentBinding;)V", "currentDailyDetailsEntity", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "getCurrentDailyDetailsEntity", "()Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "setCurrentDailyDetailsEntity", "(Lcom/example/acapplication/model/entity/DailyDetailsEntity;)V", "currentPaymentEntity", "Lcom/example/acapplication/model/entity/PaymentEntity;", "getCurrentPaymentEntity", "()Lcom/example/acapplication/model/entity/PaymentEntity;", "setCurrentPaymentEntity", "(Lcom/example/acapplication/model/entity/PaymentEntity;)V", "imageUrl", "Landroid/net/Uri;", "isAdding", "", "()Z", "setAdding", "(Z)V", "paymentViewModel", "Lcom/example/acapplication/viewmodel/PaymentViewModel;", "paymentViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/PaymentViewModelFactory;", "getPaymentViewModelFactory", "()Lcom/example/acapplication/viewmodel/viewmodelfactory/PaymentViewModelFactory;", "setPaymentViewModelFactory", "(Lcom/example/acapplication/viewmodel/viewmodelfactory/PaymentViewModelFactory;)V", "getLastDailyDetailsId", "", "imgFromCompany", "imgToRotation", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddPaymentActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean isAdding = true;
    @org.jetbrains.annotations.Nullable()
    private com.example.acapplication.model.entity.DailyDetailsEntity currentDailyDetailsEntity;
    @org.jetbrains.annotations.Nullable()
    private com.example.acapplication.model.entity.PaymentEntity currentPaymentEntity;
    public com.example.acapplication.databinding.ActivityAddPaymentBinding binding;
    @javax.inject.Inject()
    public com.example.acapplication.viewmodel.viewmodelfactory.PaymentViewModelFactory paymentViewModelFactory;
    private com.example.acapplication.viewmodel.PaymentViewModel paymentViewModel;
    private android.net.Uri imageUrl;
    private java.util.HashMap _$_findViewCache;
    
    public AddPaymentActivity() {
        super();
    }
    
    public final boolean isAdding() {
        return false;
    }
    
    public final void setAdding(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.acapplication.model.entity.DailyDetailsEntity getCurrentDailyDetailsEntity() {
        return null;
    }
    
    public final void setCurrentDailyDetailsEntity(@org.jetbrains.annotations.Nullable()
    com.example.acapplication.model.entity.DailyDetailsEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.acapplication.model.entity.PaymentEntity getCurrentPaymentEntity() {
        return null;
    }
    
    public final void setCurrentPaymentEntity(@org.jetbrains.annotations.Nullable()
    com.example.acapplication.model.entity.PaymentEntity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.databinding.ActivityAddPaymentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.databinding.ActivityAddPaymentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.viewmodel.viewmodelfactory.PaymentViewModelFactory getPaymentViewModelFactory() {
        return null;
    }
    
    public final void setPaymentViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.viewmodel.viewmodelfactory.PaymentViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getLastDailyDetailsId() {
    }
    
    private final void imgToRotation() {
    }
    
    private final void imgFromCompany() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}