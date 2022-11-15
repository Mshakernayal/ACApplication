package com.example.acapplication.view.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J-\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%H\u0016\u00a2\u0006\u0002\u0010&J\u001a\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006)"}, d2 = {"Lcom/example/acapplication/view/dialog/AddClientDialog;", "Landroidx/fragment/app/DialogFragment;", "imageUri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "_binding", "Lcom/example/acapplication/databinding/DialogAddClientBinding;", "binding", "getBinding", "()Lcom/example/acapplication/databinding/DialogAddClientBinding;", "clientViewModel", "Lcom/example/acapplication/viewmodel/ClientViewModel;", "clientViewModelFactory", "Lcom/example/acapplication/viewmodel/viewmodelfactory/ClientViewModelFactory;", "getClientViewModelFactory", "()Lcom/example/acapplication/viewmodel/viewmodelfactory/ClientViewModelFactory;", "setClientViewModelFactory", "(Lcom/example/acapplication/viewmodel/viewmodelfactory/ClientViewModelFactory;)V", "getImageUri", "()Landroid/net/Uri;", "getMutableLiveData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddClientDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri imageUri = null;
    private com.example.acapplication.databinding.DialogAddClientBinding _binding;
    @javax.inject.Inject()
    public com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory clientViewModelFactory;
    private com.example.acapplication.viewmodel.ClientViewModel clientViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public AddClientDialog(@org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getImageUri() {
        return null;
    }
    
    private final com.example.acapplication.databinding.DialogAddClientBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory getClientViewModelFactory() {
        return null;
    }
    
    public final void setClientViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getMutableLiveData() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
}