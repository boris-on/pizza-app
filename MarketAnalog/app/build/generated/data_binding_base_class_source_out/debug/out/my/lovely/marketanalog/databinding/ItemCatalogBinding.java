// Generated by view binder compiler. Do not edit!
package my.lovely.marketanalog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ItemCatalogBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView tvCatalogName;

  private ItemCatalogBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull TextView tvCatalogName) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.tvCatalogName = tvCatalogName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCatalogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCatalogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_catalog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCatalogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.tvCatalogName;
      TextView tvCatalogName = ViewBindings.findChildViewById(rootView, id);
      if (tvCatalogName == null) {
        break missingId;
      }

      return new ItemCatalogBinding((CardView) rootView, cardView, tvCatalogName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
