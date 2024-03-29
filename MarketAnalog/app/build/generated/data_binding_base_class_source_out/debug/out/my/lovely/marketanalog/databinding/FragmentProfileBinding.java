// Generated by view binder compiler. Do not edit!
package my.lovely.marketanalog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import my.lovely.marketanalog.R;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btProfileExit;

  @NonNull
  public final Button btSave;

  @NonNull
  public final EditText edRegAdressProfile;

  @NonNull
  public final EditText edRegEmailProfile;

  @NonNull
  public final EditText edRegPhoneProfile;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearRegHide;

  @NonNull
  public final ProgressBar profileProgressBar;

  @NonNull
  public final TextView tvRegError;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView, @NonNull Button btProfileExit,
      @NonNull Button btSave, @NonNull EditText edRegAdressProfile,
      @NonNull EditText edRegEmailProfile, @NonNull EditText edRegPhoneProfile,
      @NonNull ImageView imageView, @NonNull LinearLayout linearRegHide,
      @NonNull ProgressBar profileProgressBar, @NonNull TextView tvRegError) {
    this.rootView = rootView;
    this.btProfileExit = btProfileExit;
    this.btSave = btSave;
    this.edRegAdressProfile = edRegAdressProfile;
    this.edRegEmailProfile = edRegEmailProfile;
    this.edRegPhoneProfile = edRegPhoneProfile;
    this.imageView = imageView;
    this.linearRegHide = linearRegHide;
    this.profileProgressBar = profileProgressBar;
    this.tvRegError = tvRegError;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btProfileExit;
      Button btProfileExit = ViewBindings.findChildViewById(rootView, id);
      if (btProfileExit == null) {
        break missingId;
      }

      id = R.id.btSave;
      Button btSave = ViewBindings.findChildViewById(rootView, id);
      if (btSave == null) {
        break missingId;
      }

      id = R.id.edRegAdressProfile;
      EditText edRegAdressProfile = ViewBindings.findChildViewById(rootView, id);
      if (edRegAdressProfile == null) {
        break missingId;
      }

      id = R.id.edRegEmailProfile;
      EditText edRegEmailProfile = ViewBindings.findChildViewById(rootView, id);
      if (edRegEmailProfile == null) {
        break missingId;
      }

      id = R.id.edRegPhoneProfile;
      EditText edRegPhoneProfile = ViewBindings.findChildViewById(rootView, id);
      if (edRegPhoneProfile == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearRegHide;
      LinearLayout linearRegHide = ViewBindings.findChildViewById(rootView, id);
      if (linearRegHide == null) {
        break missingId;
      }

      id = R.id.profileProgressBar;
      ProgressBar profileProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (profileProgressBar == null) {
        break missingId;
      }

      id = R.id.tvRegError;
      TextView tvRegError = ViewBindings.findChildViewById(rootView, id);
      if (tvRegError == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ConstraintLayout) rootView, btProfileExit, btSave,
          edRegAdressProfile, edRegEmailProfile, edRegPhoneProfile, imageView, linearRegHide,
          profileProgressBar, tvRegError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
