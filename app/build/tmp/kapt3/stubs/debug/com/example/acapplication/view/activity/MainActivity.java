package com.example.acapplication.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\"\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020#H\u0016J\u0012\u0010&\u001a\u00020\u00182\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/acapplication/view/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/acapplication/util/interfaces/OnClientNameClickListener;", "Lcom/example/acapplication/util/interfaces/OnDailyDetailsItemClickListener;", "()V", "addClientDialog", "Lcom/example/acapplication/view/dialog/AddClientDialog;", "binding", "Lcom/example/acapplication/databinding/ActivityMainBinding;", "clientRecyclerAdapter", "Lcom/example/acapplication/view/adapter/MainActivityNamesRecyclerAdapter;", "dailyDetailsRecyclerAdapter", "Lcom/example/acapplication/view/adapter/MainActivityDailyDetailsRecyclerAdapter;", "dailyDetailsViewModel", "Lcom/example/acapplication/viewmodel/DailyDetailsViewModel;", "dailyDetailsViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/DailyDetailsViewModelFactory;", "getDailyDetailsViewModelFactory", "()Lcom/example/acapplication/viewmodel/viewmodelfactory/DailyDetailsViewModelFactory;", "setDailyDetailsViewModelFactory", "(Lcom/example/acapplication/viewmodel/viewmodelfactory/DailyDetailsViewModelFactory;)V", "imageUri", "Landroid/net/Uri;", "getAllClientName", "", "getAllDailyDetails", "getMutableLiveData", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClientNameItemClickListener", "passesClientEntity", "Lcom/example/acapplication/model/entity/ClientEntity;", "onClientNameItemLongClickListener", "clientEntity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDailyDetailsItemClickListener", "passesDailyDetailsEntity", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "onDailyDetailsItemLongClickListener", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.acapplication.util.interfaces.OnClientNameClickListener, com.example.acapplication.util.interfaces.OnDailyDetailsItemClickListener {
    private com.example.acapplication.view.dialog.AddClientDialog addClientDialog;
    private com.example.acapplication.databinding.ActivityMainBinding binding;
    private android.net.Uri imageUri;
    @javax.inject.Inject()
    public com.example.acapplication.viewmodel.viewmodelfactory.DailyDetailsViewModelFactory dailyDetailsViewModelFactory;
    private com.example.acapplication.viewmodel.DailyDetailsViewModel dailyDetailsViewModel;
    private com.example.acapplication.view.adapter.MainActivityDailyDetailsRecyclerAdapter dailyDetailsRecyclerAdapter;
    private com.example.acapplication.view.adapter.MainActivityNamesRecyclerAdapter clientRecyclerAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.viewmodel.viewmodelfactory.DailyDetailsViewModelFactory getDailyDetailsViewModelFactory() {
        return null;
    }
    
    public final void setDailyDetailsViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.viewmodel.viewmodelfactory.DailyDetailsViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getAllDailyDetails() {
    }
    
    private final void getAllClientName() {
    }
    
    private final void getMutableLiveData() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onClientNameItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.ClientEntity passesClientEntity) {
    }
    
    @java.lang.Override()
    public void onClientNameItemLongClickListener(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.ClientEntity clientEntity) {
    }
    
    @java.lang.Override()
    public void onDailyDetailsItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity passesDailyDetailsEntity) {
    }
    
    @java.lang.Override()
    public void onDailyDetailsItemLongClickListener(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.model.entity.DailyDetailsEntity passesDailyDetailsEntity) {
    }
}