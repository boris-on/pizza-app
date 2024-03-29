// Generated by view binder compiler. Do not edit!
package my.lovely.marketanalog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import my.lovely.marketanalog.R;

public final class FragmentBasketBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView basketRecyclerView;

  @NonNull
  public final Button btBasketPay;

  @NonNull
  public final ImageView imToolbar;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout toolbarCatalog;

  @NonNull
  public final CardView toolbarRingCardView;

  @NonNull
  public final TextView tvMainCity;

  @NonNull
  public final TextView tvMainDate;

  @NonNull
  public final View view;

  @NonNull
  public final View view3;

  private FragmentBasketBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView basketRecyclerView, @NonNull Button btBasketPay,
      @NonNull ImageView imToolbar, @NonNull ImageView imageView,
      @NonNull LinearLayout toolbarCatalog, @NonNull CardView toolbarRingCardView,
      @NonNull TextView tvMainCity, @NonNull TextView tvMainDate, @NonNull View view,
      @NonNull View view3) {
    this.rootView = rootView;
    this.basketRecyclerView = basketRecyclerView;
    this.btBasketPay = btBasketPay;
    this.imToolbar = imToolbar;
    this.imageView = imageView;
    this.toolbarCatalog = toolbarCatalog;
    this.toolbarRingCardView = toolbarRingCardView;
    this.tvMainCity = tvMainCity;
    this.tvMainDate = tvMainDate;
    this.view = view;
    this.view3 = view3;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBasketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBasketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_basket, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBasketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basketRecyclerView;
      RecyclerView basketRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (basketRecyclerView == null) {
        break missingId;
      }

      id = R.id.btBasketPay;
      Button btBasketPay = ViewBindings.findChildViewById(rootView, id);
      if (btBasketPay == null) {
        break missingId;
      }

      id = R.id.imToolbar;
      ImageView imToolbar = ViewBindings.findChildViewById(rootView, id);
      if (imToolbar == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.toolbarCatalog;
      LinearLayout toolbarCatalog = ViewBindings.findChildViewById(rootView, id);
      if (toolbarCatalog == null) {
        break missingId;
      }

      id = R.id.toolbarRingCardView;
      CardView toolbarRingCardView = ViewBindings.findChildViewById(rootView, id);
      if (toolbarRingCardView == null) {
        break missingId;
      }

      id = R.id.tvMainCity;
      TextView tvMainCity = ViewBindings.findChildViewById(rootView, id);
      if (tvMainCity == null) {
        break missingId;
      }

      id = R.id.tvMainDate;
      TextView tvMainDate = ViewBindings.findChildViewById(rootView, id);
      if (tvMainDate == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      return new FragmentBasketBinding((LinearLayout) rootView, basketRecyclerView, btBasketPay,
          imToolbar, imageView, toolbarCatalog, toolbarRingCardView, tvMainCity, tvMainDate, view,
          view3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
