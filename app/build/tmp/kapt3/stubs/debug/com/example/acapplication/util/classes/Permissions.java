package com.example.acapplication.util.classes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/acapplication/util/classes/Permissions;", "", "()V", "Companion", "app_debug"})
public final class Permissions {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.acapplication.util.classes.Permissions.Companion Companion = null;
    public static final int ADD_INVOICE_LOGO_PERMISSION_CODE = 1;
    public static final int ADD_PAYMENT_LOGO_PERMISSION_CODE = 2;
    public static final int ADD_SPEND_LOGO_PERMISSION_CODE = 3;
    public static final int ADD_CLIENT_PHOTO_PERMISSION_CODE = 4;
    public static final int PROFILE_PHOTO_PERMISSION_CODE = 5;
    public static final int PROFILE_CALL_PERMISSION_CODE = 6;
    
    public Permissions() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J5\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/acapplication/util/classes/Permissions$Companion;", "", "()V", "ADD_CLIENT_PHOTO_PERMISSION_CODE", "", "ADD_INVOICE_LOGO_PERMISSION_CODE", "ADD_PAYMENT_LOGO_PERMISSION_CODE", "ADD_SPEND_LOGO_PERMISSION_CODE", "PROFILE_CALL_PERMISSION_CODE", "PROFILE_PHOTO_PERMISSION_CODE", "isPermissionGranted", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "requestRunTimePermission", "", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "permission", "requestPermission", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void requestRunTimePermission(@org.jetbrains.annotations.Nullable()
        android.app.Activity activity, @org.jetbrains.annotations.Nullable()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        java.lang.String[] permission, int requestPermission) {
        }
        
        public final boolean isPermissionGranted(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String[] permissions) {
            return false;
        }
    }
}