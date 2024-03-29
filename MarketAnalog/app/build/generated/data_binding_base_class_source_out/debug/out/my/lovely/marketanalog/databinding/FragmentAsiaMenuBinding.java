// Generated by view binder compiler. Do not edit!
package my.lovely.marketanalog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import my.lovely.marketanalog.R;

public final class FragmentAsiaMenuBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imToolbar;

  @NonNull
  public final ProgressBar progressBarMenu;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RecyclerView recyclerViewTags;

  @NonNull
  public final LinearLayout toolbarAsiaMenu;

  @NonNull
  public final CardView toolbarRingCardView;

  @NonNull
  public final TextView tvMenuCategory;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  private FragmentAsiaMenuBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imToolbar,
      @NonNull ProgressBar progressBarMenu, @NonNull RecyclerView recyclerView,
      @NonNull RecyclerView recyclerViewTags, @NonNull LinearLayout toolbarAsiaMenu,
      @NonNull CardView toolbarRingCardView, @NonNull TextView tvMenuCategory, @NonNull View view,
      @NonNull View view2) {
    this.rootView = rootView;
    this.imToolbar = imToolbar;
    this.progressBarMenu = progressBarMenu;
    this.recyclerView = recyclerView;
    this.recyclerViewTags = recyclerViewTags;
    this.toolbarAsiaMenu = toolbarAsiaMenu;
    this.toolbarRingCardView = toolbarRingCardView;
    this.tvMenuCategory = tvMenuCategory;
    this.view = view;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAsiaMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAsiaMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_asia_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAsiaMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imToolbar;
      ImageView imToolbar = ViewBindings.findChildViewById(rootView, id);
      if (imToolbar == null) {
        break missingId;
      }

      id = R.id.progressBarMenu;
      ProgressBar progressBarMenu = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMenu == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.recyclerViewTags;
      RecyclerView recyclerViewTags = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewTags == null) {
        break missingId;
      }

      id = R.id.toolbarAsiaMenu;
      LinearLayout toolbarAsiaMenu = ViewBindings.findChildViewById(rootView, id);
      if (toolbarAsiaMenu == null) {
        break missingId;
      }

      id = R.id.toolbarRingCardView;
      CardView toolbarRingCardView = ViewBindings.findChildViewById(rootView, id);
      if (toolbarRingCardView == null) {
        break missingId;
      }

      id = R.id.tvMenuCategory;
      TextView tvMenuCategory = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuCategory == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new FragmentAsiaMenuBinding((ConstraintLayout) rootView, imToolbar, progressBarMenu,
          recyclerView, recyclerViewTags, toolbarAsiaMenu, toolbarRingCardView, tvMenuCategory,
          view, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}