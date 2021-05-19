package com.example.track_me;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.track_me.databinding.LocationFragmentBindingImpl;
import com.example.track_me.databinding.LocationFragmentBindingLandImpl;
import com.example.track_me.databinding.VerificationFragmentBindingImpl;
import com.example.track_me.databinding.VerificationFragmentBindingLandImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_LOCATIONFRAGMENT = 1;

  private static final int LAYOUT_VERIFICATIONFRAGMENT = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.track_me.R.layout.location_fragment, LAYOUT_LOCATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.track_me.R.layout.verification_fragment, LAYOUT_VERIFICATIONFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_LOCATIONFRAGMENT: {
          if ("layout-land/location_fragment_0".equals(tag)) {
            return new LocationFragmentBindingLandImpl(component, view);
          }
          if ("layout/location_fragment_0".equals(tag)) {
            return new LocationFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for location_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_VERIFICATIONFRAGMENT: {
          if ("layout-land/verification_fragment_0".equals(tag)) {
            return new VerificationFragmentBindingLandImpl(component, view);
          }
          if ("layout/verification_fragment_0".equals(tag)) {
            return new VerificationFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for verification_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout-land/location_fragment_0", com.example.track_me.R.layout.location_fragment);
      sKeys.put("layout/location_fragment_0", com.example.track_me.R.layout.location_fragment);
      sKeys.put("layout-land/verification_fragment_0", com.example.track_me.R.layout.verification_fragment);
      sKeys.put("layout/verification_fragment_0", com.example.track_me.R.layout.verification_fragment);
    }
  }
}
