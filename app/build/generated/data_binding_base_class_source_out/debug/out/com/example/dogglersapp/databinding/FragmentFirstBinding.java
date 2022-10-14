// Generated by view binder compiler. Do not edit!
package com.example.dogglersapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglersapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dogAge;

  @NonNull
  public final TextView dogHobbies;

  @NonNull
  public final ImageView dogImage;

  @NonNull
  public final TextView dogName;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Button next;

  @NonNull
  public final Button previous;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView, @NonNull TextView dogAge,
      @NonNull TextView dogHobbies, @NonNull ImageView dogImage, @NonNull TextView dogName,
      @NonNull Guideline guideline2, @NonNull Button next, @NonNull Button previous) {
    this.rootView = rootView;
    this.dogAge = dogAge;
    this.dogHobbies = dogHobbies;
    this.dogImage = dogImage;
    this.dogName = dogName;
    this.guideline2 = guideline2;
    this.next = next;
    this.previous = previous;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dog_age;
      TextView dogAge = ViewBindings.findChildViewById(rootView, id);
      if (dogAge == null) {
        break missingId;
      }

      id = R.id.dog_hobbies;
      TextView dogHobbies = ViewBindings.findChildViewById(rootView, id);
      if (dogHobbies == null) {
        break missingId;
      }

      id = R.id.dog_image;
      ImageView dogImage = ViewBindings.findChildViewById(rootView, id);
      if (dogImage == null) {
        break missingId;
      }

      id = R.id.dog_name;
      TextView dogName = ViewBindings.findChildViewById(rootView, id);
      if (dogName == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.next;
      Button next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
        break missingId;
      }

      id = R.id.previous;
      Button previous = ViewBindings.findChildViewById(rootView, id);
      if (previous == null) {
        break missingId;
      }

      return new FragmentFirstBinding((ConstraintLayout) rootView, dogAge, dogHobbies, dogImage,
          dogName, guideline2, next, previous);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
