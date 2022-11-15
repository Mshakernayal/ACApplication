package com.example.acapplication.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J-\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0016\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/acapplication/view/activity/ProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/acapplication/databinding/ActivityProfileBinding;", "clientViewModel", "Lcom/example/acapplication/viewmodel/ClientViewModel;", "clientViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/ClientViewModelFactory;", "getClientViewModelFactory", "()Lcom/example/acapplication/viewmodel/viewmodelfactory/ClientViewModelFactory;", "setClientViewModelFactory", "(Lcom/example/acapplication/viewmodel/viewmodelfactory/ClientViewModelFactory;)V", "currentClientEntity", "Lcom/example/acapplication/model/entity/ClientEntity;", "profileActivityRecentActionRecyclerAdapter", "Lcom/example/acapplication/view/adapter/ProfileActivityRecentActionRecyclerAdapter;", "getAllClient", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProfileActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.acapplication.model.entity.ClientEntity currentClientEntity;
    private com.example.acapplication.databinding.ActivityProfileBinding binding;
    @javax.inject.Inject()
    public com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory clientViewModelFactory;
    private com.example.acapplication.viewmodel.ClientViewModel clientViewModel;
    private com.example.acapplication.view.adapter.ProfileActivityRecentActionRecyclerAdapter profileActivityRecentActionRecyclerAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public ProfileActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory getClientViewModelFactory() {
        return null;
    }
    
    public final void setClientViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getAllClient() {
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