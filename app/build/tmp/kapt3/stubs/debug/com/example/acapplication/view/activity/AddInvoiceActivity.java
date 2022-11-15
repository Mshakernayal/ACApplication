package com.example.acapplication.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J-\u0010\"\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'H\u0016\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/acapplication/view/activity/AddInvoiceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/acapplication/databinding/ActivityAddInvoiceBinding;", "currentDailyDetailsEntity", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "currentInvoiceEntity", "Lcom/example/acapplication/model/entity/InvoiceEntity;", "imageUrl", "Landroid/net/Uri;", "invoiceViewModel", "Lcom/example/acapplication/viewmodel/InvoiceViewModel;", "invoiceViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/InvoiceViewModelFactory;", "getInvoiceViewModelFactory", "()Lcom/example/acapplication/viewmodel/viewmodelfactory/InvoiceViewModelFactory;", "setInvoiceViewModelFactory", "(Lcom/example/acapplication/viewmodel/viewmodelfactory/InvoiceViewModelFactory;)V", "isAdding", "", "getLastDailyDetailsId", "", "imgFromRotation", "imgOnRotation", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddInvoiceActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean isAdding = true;
    private com.example.acapplication.model.entity.DailyDetailsEntity currentDailyDetailsEntity;
    private com.example.acapplication.model.entity.InvoiceEntity currentInvoiceEntity;
    private com.example.acapplication.databinding.ActivityAddInvoiceBinding binding;
    private android.net.Uri imageUrl;
    @javax.inject.Inject()
    public com.example.acapplication.viewmodel.viewmodelfactory.InvoiceViewModelFactory invoiceViewModelFactory;
    private com.example.acapplication.viewmodel.InvoiceViewModel invoiceViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public AddInvoiceActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.viewmodel.viewmodelfactory.InvoiceViewModelFactory getInvoiceViewModelFactory() {
        return null;
    }
    
    public final void setInvoiceViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.viewmodel.viewmodelfactory.InvoiceViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getLastDailyDetailsId() {
    }
    
    private final void imgFromRotation() {
    }
    
    private final void imgOnRotation() {
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