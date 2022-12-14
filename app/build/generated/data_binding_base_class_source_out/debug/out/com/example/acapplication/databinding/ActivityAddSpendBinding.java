// Generated by view binder compiler. Do not edit!
package com.example.acapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.acapplication.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddSpendBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnActivityAddSpendAddCancel;

  @NonNull
  public final MaterialButton btnActivityAddSpendSave;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final AutoCompleteTextView edtActivityAddSpendDetails;

  @NonNull
  public final TextInputEditText edtActivityAddSpendNotice;

  @NonNull
  public final TextInputEditText edtActivityAddSpendTotalMoney;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final MaterialButton imgActivityAddInvoiceLogo;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextInputLayout textInputLayout4;

  @NonNull
  public final TextInputLayout textInputLayout5;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView txtActivityAddSpendBarcodeNumber;

  @NonNull
  public final View view2;

  private ActivityAddSpendBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnActivityAddSpendAddCancel,
      @NonNull MaterialButton btnActivityAddSpendSave, @NonNull CardView cardView2,
      @NonNull AutoCompleteTextView edtActivityAddSpendDetails,
      @NonNull TextInputEditText edtActivityAddSpendNotice,
      @NonNull TextInputEditText edtActivityAddSpendTotalMoney, @NonNull ImageView imageView,
      @NonNull MaterialButton imgActivityAddInvoiceLogo, @NonNull TextInputLayout textInputLayout3,
      @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5,
      @NonNull TextView textView, @NonNull TextView txtActivityAddSpendBarcodeNumber,
      @NonNull View view2) {
    this.rootView = rootView;
    this.btnActivityAddSpendAddCancel = btnActivityAddSpendAddCancel;
    this.btnActivityAddSpendSave = btnActivityAddSpendSave;
    this.cardView2 = cardView2;
    this.edtActivityAddSpendDetails = edtActivityAddSpendDetails;
    this.edtActivityAddSpendNotice = edtActivityAddSpendNotice;
    this.edtActivityAddSpendTotalMoney = edtActivityAddSpendTotalMoney;
    this.imageView = imageView;
    this.imgActivityAddInvoiceLogo = imgActivityAddInvoiceLogo;
    this.textInputLayout3 = textInputLayout3;
    this.textInputLayout4 = textInputLayout4;
    this.textInputLayout5 = textInputLayout5;
    this.textView = textView;
    this.txtActivityAddSpendBarcodeNumber = txtActivityAddSpendBarcodeNumber;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddSpendBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddSpendBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_spend, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddSpendBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnActivityAddSpendAddCancel;
      MaterialButton btnActivityAddSpendAddCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnActivityAddSpendAddCancel == null) {
        break missingId;
      }

      id = R.id.btnActivityAddSpendSave;
      MaterialButton btnActivityAddSpendSave = ViewBindings.findChildViewById(rootView, id);
      if (btnActivityAddSpendSave == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.edtActivityAddSpendDetails;
      AutoCompleteTextView edtActivityAddSpendDetails = ViewBindings.findChildViewById(rootView, id);
      if (edtActivityAddSpendDetails == null) {
        break missingId;
      }

      id = R.id.edtActivityAddSpendNotice;
      TextInputEditText edtActivityAddSpendNotice = ViewBindings.findChildViewById(rootView, id);
      if (edtActivityAddSpendNotice == null) {
        break missingId;
      }

      id = R.id.edtActivityAddSpendTotalMoney;
      TextInputEditText edtActivityAddSpendTotalMoney = ViewBindings.findChildViewById(rootView, id);
      if (edtActivityAddSpendTotalMoney == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imgActivityAddInvoiceLogo;
      MaterialButton imgActivityAddInvoiceLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgActivityAddInvoiceLogo == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textInputLayout4;
      TextInputLayout textInputLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout4 == null) {
        break missingId;
      }

      id = R.id.textInputLayout5;
      TextInputLayout textInputLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout5 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.txtActivityAddSpendBarcodeNumber;
      TextView txtActivityAddSpendBarcodeNumber = ViewBindings.findChildViewById(rootView, id);
      if (txtActivityAddSpendBarcodeNumber == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityAddSpendBinding((ConstraintLayout) rootView, btnActivityAddSpendAddCancel,
          btnActivityAddSpendSave, cardView2, edtActivityAddSpendDetails, edtActivityAddSpendNotice,
          edtActivityAddSpendTotalMoney, imageView, imgActivityAddInvoiceLogo, textInputLayout3,
          textInputLayout4, textInputLayout5, textView, txtActivityAddSpendBarcodeNumber, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
