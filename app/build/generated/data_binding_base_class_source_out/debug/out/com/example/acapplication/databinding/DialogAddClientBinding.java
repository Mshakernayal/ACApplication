// Generated by view binder compiler. Do not edit!
package com.example.acapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.acapplication.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogAddClientBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnDialogAddClientCancel;

  @NonNull
  public final MaterialButton btnDialogAddClientSave;

  @NonNull
  public final TextInputEditText edtDialogAddClientAddress;

  @NonNull
  public final TextInputEditText edtDialogAddClientName;

  @NonNull
  public final TextInputEditText edtDialogAddClientPhone;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final CircleImageView imgDialogAddClient;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout13;

  @NonNull
  public final TextView textView;

  @NonNull
  public final View view2;

  private DialogAddClientBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnDialogAddClientCancel,
      @NonNull MaterialButton btnDialogAddClientSave,
      @NonNull TextInputEditText edtDialogAddClientAddress,
      @NonNull TextInputEditText edtDialogAddClientName,
      @NonNull TextInputEditText edtDialogAddClientPhone, @NonNull ImageView imageView,
      @NonNull CircleImageView imgDialogAddClient, @NonNull TextInputLayout textInputLayout,
      @NonNull TextInputLayout textInputLayout13, @NonNull TextView textView, @NonNull View view2) {
    this.rootView = rootView;
    this.btnDialogAddClientCancel = btnDialogAddClientCancel;
    this.btnDialogAddClientSave = btnDialogAddClientSave;
    this.edtDialogAddClientAddress = edtDialogAddClientAddress;
    this.edtDialogAddClientName = edtDialogAddClientName;
    this.edtDialogAddClientPhone = edtDialogAddClientPhone;
    this.imageView = imageView;
    this.imgDialogAddClient = imgDialogAddClient;
    this.textInputLayout = textInputLayout;
    this.textInputLayout13 = textInputLayout13;
    this.textView = textView;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogAddClientBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogAddClientBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_add_client, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogAddClientBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDialogAddClientCancel;
      MaterialButton btnDialogAddClientCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnDialogAddClientCancel == null) {
        break missingId;
      }

      id = R.id.btnDialogAddClientSave;
      MaterialButton btnDialogAddClientSave = ViewBindings.findChildViewById(rootView, id);
      if (btnDialogAddClientSave == null) {
        break missingId;
      }

      id = R.id.edtDialogAddClientAddress;
      TextInputEditText edtDialogAddClientAddress = ViewBindings.findChildViewById(rootView, id);
      if (edtDialogAddClientAddress == null) {
        break missingId;
      }

      id = R.id.edtDialogAddClientName;
      TextInputEditText edtDialogAddClientName = ViewBindings.findChildViewById(rootView, id);
      if (edtDialogAddClientName == null) {
        break missingId;
      }

      id = R.id.edtDialogAddClientPhone;
      TextInputEditText edtDialogAddClientPhone = ViewBindings.findChildViewById(rootView, id);
      if (edtDialogAddClientPhone == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imgDialogAddClient;
      CircleImageView imgDialogAddClient = ViewBindings.findChildViewById(rootView, id);
      if (imgDialogAddClient == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textInputLayout13;
      TextInputLayout textInputLayout13 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout13 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new DialogAddClientBinding((ConstraintLayout) rootView, btnDialogAddClientCancel,
          btnDialogAddClientSave, edtDialogAddClientAddress, edtDialogAddClientName,
          edtDialogAddClientPhone, imageView, imgDialogAddClient, textInputLayout,
          textInputLayout13, textView, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
