// Generated by view binder compiler. Do not edit!
package my.lovely.marketanalog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import my.lovely.marketanalog.R;

public final class AlertDialogDishCardBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button btAlertFastOrder;

  @NonNull
  public final Button btCardAddToBucket;

  @NonNull
  public final ImageButton imBtCross;

  @NonNull
  public final ImageButton imBtLike;

  @NonNull
  public final ImageView imCardDish;

  @NonNull
  public final TextView tvCardDescription;

  @NonNull
  public final TextView tvCardName;

  @NonNull
  public final TextView tvCardPrice;

  @NonNull
  public final TextView tvCardWeight;

  private AlertDialogDishCardBinding(@NonNull CardView rootView, @NonNull Button btAlertFastOrder,
      @NonNull Button btCardAddToBucket, @NonNull ImageButton imBtCross,
      @NonNull ImageButton imBtLike, @NonNull ImageView imCardDish,
      @NonNull TextView tvCardDescription, @NonNull TextView tvCardName,
      @NonNull TextView tvCardPrice, @NonNull TextView tvCardWeight) {
    this.rootView = rootView;
    this.btAlertFastOrder = btAlertFastOrder;
    this.btCardAddToBucket = btCardAddToBucket;
    this.imBtCross = imBtCross;
    this.imBtLike = imBtLike;
    this.imCardDish = imCardDish;
    this.tvCardDescription = tvCardDescription;
    this.tvCardName = tvCardName;
    this.tvCardPrice = tvCardPrice;
    this.tvCardWeight = tvCardWeight;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static AlertDialogDishCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AlertDialogDishCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.alert_dialog_dish_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AlertDialogDishCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btAlertFastOrder;
      Button btAlertFastOrder = ViewBindings.findChildViewById(rootView, id);
      if (btAlertFastOrder == null) {
        break missingId;
      }

      id = R.id.btCardAddToBucket;
      Button btCardAddToBucket = ViewBindings.findChildViewById(rootView, id);
      if (btCardAddToBucket == null) {
        break missingId;
      }

      id = R.id.imBtCross;
      ImageButton imBtCross = ViewBindings.findChildViewById(rootView, id);
      if (imBtCross == null) {
        break missingId;
      }

      id = R.id.imBtLike;
      ImageButton imBtLike = ViewBindings.findChildViewById(rootView, id);
      if (imBtLike == null) {
        break missingId;
      }

      id = R.id.imCardDish;
      ImageView imCardDish = ViewBindings.findChildViewById(rootView, id);
      if (imCardDish == null) {
        break missingId;
      }

      id = R.id.tvCardDescription;
      TextView tvCardDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvCardDescription == null) {
        break missingId;
      }

      id = R.id.tvCardName;
      TextView tvCardName = ViewBindings.findChildViewById(rootView, id);
      if (tvCardName == null) {
        break missingId;
      }

      id = R.id.tvCardPrice;
      TextView tvCardPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvCardPrice == null) {
        break missingId;
      }

      id = R.id.tvCardWeight;
      TextView tvCardWeight = ViewBindings.findChildViewById(rootView, id);
      if (tvCardWeight == null) {
        break missingId;
      }

      return new AlertDialogDishCardBinding((CardView) rootView, btAlertFastOrder,
          btCardAddToBucket, imBtCross, imBtLike, imCardDish, tvCardDescription, tvCardName,
          tvCardPrice, tvCardWeight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}