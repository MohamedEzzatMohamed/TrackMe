package com.example.track_me.databinding;
import com.example.track_me.R;
import com.example.track_me.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LocationFragmentBindingLandImpl extends LocationFragmentBinding implements com.example.track_me.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_device_name_TextView, 7);
        sViewsWithIds.put(R.id.last_update_TextView, 8);
        sViewsWithIds.put(R.id.inner_ConstraintLayout, 9);
        sViewsWithIds.put(R.id.location_imageView, 10);
        sViewsWithIds.put(R.id.latitude_TextView, 11);
        sViewsWithIds.put(R.id.longitude_TextView, 12);
        sViewsWithIds.put(R.id.elevation_imageView, 13);
        sViewsWithIds.put(R.id.elevation_TextView, 14);
        sViewsWithIds.put(R.id.inner_timer_LinearLayout, 15);
        sViewsWithIds.put(R.id.update_interval_TextView, 16);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LocationFragmentBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private LocationFragmentBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[16]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[7]
            );
        this.errorTextView.setTag(null);
        this.fiveImageView.setTag(null);
        this.locationLayout.setTag(null);
        this.oneImageView.setTag(null);
        this.sevenImageView.setTag(null);
        this.threeImageView.setTag(null);
        this.updateNowButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.track_me.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.track_me.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.example.track_me.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.track_me.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.track_me.screens.location.LocationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.track_me.screens.location.LocationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsSuccess((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelWaitingTime((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsSuccess(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaitingTime(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelWaitingTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelIsSuccessViewGONEViewVISIBLE = 0;
        boolean viewModelWaitingTime = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelWaitingTimeGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuccessGetValue = false;
        java.lang.Boolean viewModelWaitingTimeGetValue = null;
        java.lang.Boolean viewModelIsSuccessGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelWaitingTime = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsSuccess = null;
        com.example.track_me.screens.location.LocationViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelWaitingTime1 = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSuccess()
                        viewModelIsSuccess = viewModel.isSuccess();
                    }
                    updateLiveDataRegistration(0, viewModelIsSuccess);


                    if (viewModelIsSuccess != null) {
                        // read viewModel.isSuccess().getValue()
                        viewModelIsSuccessGetValue = viewModelIsSuccess.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuccess().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuccessGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSuccessGetValue);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuccessGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuccess().getValue()) ? View.GONE : View.VISIBLE
                    viewModelIsSuccessViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuccessGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitingTime
                        ViewModelWaitingTime1 = viewModel.getWaitingTime();
                    }
                    updateLiveDataRegistration(1, ViewModelWaitingTime1);


                    if (ViewModelWaitingTime1 != null) {
                        // read viewModel.waitingTime.getValue()
                        viewModelWaitingTimeGetValue = ViewModelWaitingTime1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.waitingTime.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelWaitingTimeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelWaitingTimeGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.waitingTime.getValue())
                    viewModelWaitingTime = !androidxDatabindingViewDataBindingSafeUnboxViewModelWaitingTimeGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.waitingTime.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxViewModelWaitingTime = androidx.databinding.ViewDataBinding.safeUnbox(viewModelWaitingTime);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.errorTextView.setVisibility(viewModelIsSuccessViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fiveImageView.setOnClickListener(mCallback3);
            this.oneImageView.setOnClickListener(mCallback1);
            this.sevenImageView.setOnClickListener(mCallback4);
            this.threeImageView.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.updateNowButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelWaitingTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.track_me.screens.location.LocationViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setTimeSelected(7);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.track_me.screens.location.LocationViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setTimeSelected(3);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.track_me.screens.location.LocationViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setTimeSelected(5);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.track_me.screens.location.LocationViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setTimeSelected(1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isSuccess()
        flag 1 (0x2L): viewModel.waitingTime
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuccess().getValue()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuccess().getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}