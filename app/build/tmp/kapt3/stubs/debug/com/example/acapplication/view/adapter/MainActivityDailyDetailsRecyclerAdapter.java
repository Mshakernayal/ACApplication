package com.example.acapplication.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/acapplication/view/adapter/MainActivityDailyDetailsRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "Lcom/example/acapplication/view/adapter/MainActivityDailyDetailsRecyclerAdapter$MainActivityDetailsViewHolder;", "onDailyDetailsItemClickListener", "Lcom/example/acapplication/util/interfaces/OnDailyDetailsItemClickListener;", "(Lcom/example/acapplication/util/interfaces/OnDailyDetailsItemClickListener;)V", "getOnDailyDetailsItemClickListener", "()Lcom/example/acapplication/util/interfaces/OnDailyDetailsItemClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MainActivityDetailsViewHolder", "diffUtil", "app_debug"})
public final class MainActivityDailyDetailsRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.acapplication.model.entity.DailyDetailsEntity, com.example.acapplication.view.adapter.MainActivityDailyDetailsRecyclerAdapter.MainActivityDetailsViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.acapplication.util.interfaces.OnDailyDetailsItemClickListener onDailyDetailsItemClickListener = null;
    
    public MainActivityDailyDetailsRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.util.interfaces.OnDailyDetailsItemClickListener onDailyDetailsItemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.acapplication.util.interfaces.OnDailyDetailsItemClickListener getOnDailyDetailsItemClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.acapplication.view.adapter.MainActivityDailyDetailsRecyclerAdapter.MainActivityDetailsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.acapplication.view.adapter.MainActivityDailyDetailsRecyclerAdapter.MainActivityDetailsViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/acapplication/view/adapter/MainActivityDailyDetailsRecyclerAdapter$MainActivityDetailsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/acapplication/view/adapter/MainActivityDailyDetailsRecyclerAdapter;Landroid/view/View;)V", "app_debug"})
    public final class MainActivityDetailsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public MainActivityDetailsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/acapplication/view/adapter/MainActivityDailyDetailsRecyclerAdapter$diffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/acapplication/model/entity/DailyDetailsEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class diffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.acapplication.model.entity.DailyDetailsEntity> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.acapplication.view.adapter.MainActivityDailyDetailsRecyclerAdapter.diffUtil INSTANCE = null;
        
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