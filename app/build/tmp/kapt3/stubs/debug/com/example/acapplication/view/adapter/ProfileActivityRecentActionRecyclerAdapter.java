package com.example.acapplication.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/acapplication/view/adapter/ProfileActivityRecentActionRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "Lcom/example/acapplication/view/adapter/ProfileActivityRecentActionRecyclerAdapter$ProfileActivityRecentActionViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProfileActivityRecentActionViewHolder", "diffUtil", "app_debug"})
public final class ProfileActivityRecentActionRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.acapplication.model.entity.DailyDetailsEntity, com.example.acapplication.view.adapter.ProfileActivityRecentActionRecyclerAdapter.ProfileActivityRecentActionViewHolder> {
    
    public ProfileActivityRecentActionRecyclerAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.acapplication.view.adapter.ProfileActivityRecentActionRecyclerAdapter.ProfileActivityRecentActionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.view.adapter.ProfileActivityRecentActionRecyclerAdapter.ProfileActivityRecentActionViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/acapplication/view/adapter/ProfileActivityRecentActionRecyclerAdapter$ProfileActivityRecentActionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/acapplication/view/adapter/ProfileActivityRecentActionRecyclerAdapter;Landroid/view/View;)V", "app_debug"})
    public final class ProfileActivityRecentActionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ProfileActivityRecentActionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/acapplication/view/adapter/ProfileActivityRecentActionRecyclerAdapter$diffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class diffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.acapplication.model.entity.DailyDetailsEntity> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.acapplication.view.adapter.ProfileActivityRecentActionRecyclerAdapter.diffUtil INSTANCE = null;
        
        private diffUtil() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.acapplication.model.entity.DailyDetailsEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.example.acapplication.model.entity.DailyDetailsEntity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.acapplication.model.entity.DailyDetailsEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.example.acapplication.model.entity.DailyDetailsEntity newItem) {
            return false;
        }
    }
}