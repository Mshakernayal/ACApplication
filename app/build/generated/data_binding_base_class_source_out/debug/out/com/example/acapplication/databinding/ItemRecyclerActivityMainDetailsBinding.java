// Generated by view binder compiler. Do not edit!
package com.example.acapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.acapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecyclerActivityMainDetailsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imgItemRecyclerMainActivityDetailsImage;

  @NonNull
  public final TextView txtItemRecyclerMainActivityDetailsBarcode;

  @NonNull
  public final TextView txtItemRecyclerMainActivityDetailsName;

  @NonNull
  public final TextView txtItemRecyclerMainActivityDetailsState;

  @NonNull
  public final TextView txtItemRecyclerMainActivityDetailsTotalMoney;

  private ItemRecyclerActivityMainDetailsBinding(@NonNull CardView rootView,
      @NonNull ImageView imgItemRecyclerMainActivityDetailsImage,
      @NonNull TextView txtItemRecyclerMainActivityDetailsBarcode,
      @NonNull TextView txtItemRecyclerMainActivityDetailsName,
      @NonNull TextView txtItemRecyclerMainActivityDetailsState,
      @NonNull TextView txtItemRecyclerMainActivityDetailsTotalMoney) {
    this.rootView = rootView;
    this.imgItemRecyclerMainActivityDetailsImage = imgItemRecyclerMainActivityDetailsImage;
    this.txtItemRecyclerMainActivityDetailsBarcode = txtItemRecyclerMainActivityDetailsBarcode;
    this.txtItemRecyclerMainActivityDetailsName = txtItemRecyclerMainActivityDetailsName;
    this.txtItemRecyclerMainActivityDetailsState = txtItemRecyclerMainActivityDetailsState;
    this.txtItemRecyclerMainActivityDetailsTotalMoney = txtItemRecyclerMainActivityDetailsTotalMoney;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecyclerActivityMainDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecyclerActivityMainDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_recycler_activity_main_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecyclerActivityMainDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgItemRecyclerMainActivityDetailsImage;
      ImageView imgItemRecyclerMainActivityDetailsImage = ViewBindings.findChildViewById(rootView, id);
      if (imgItemRecyclerMainActivityDetailsImage == null) {
        break missingId;
      }

      id = R.id.txtItemRecyclerMainActivityDetailsBarcode;
      TextView txtItemRecyclerMainActivityDetailsBarcode = ViewBindings.findChildViewById(rootView, id);
      if (txtItemRecyclerMainActivityDetailsBarcode == null) {
        break missingId;
      }

      id = R.id.txtItemRecyclerMainActivityDetailsName;
      TextView txtItemRecyclerMainActivityDetailsName = ViewBindings.findChildViewById(rootView, id);
      if (txtItemRecyclerMainActivityDetailsName == null) {
        break missingId;
      }

      id = R.id.txtItemRecyclerMainActivityDetailsState;
      TextView txtItemRecyclerMainActivityDetailsState = ViewBindings.findChildViewById(rootView, id);
      if (txtItemRecyclerMainActivityDetailsState == null) {
        break missingId;
      }

      id = R.id.txtItemRecyclerMainActivityDetailsTotalMoney;
      TextView txtItemRecyclerMainActivityDetailsTotalMoney = ViewBindings.findChildViewById(rootView, id);
      if (txtItemRecyclerMainActivityDetailsTotalMoney == null) {
        break missingId;
      }

      return new ItemRecyclerActivityMainDetailsBinding((CardView) rootView,
          imgItemRecyclerMainActivityDetailsImage, txtItemRecyclerMainActivityDetailsBarcode,
          txtItemRecyclerMainActivityDetailsName, txtItemRecyclerMainActivityDetailsState,
          txtItemRecyclerMainActivityDetailsTotalMoney);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}