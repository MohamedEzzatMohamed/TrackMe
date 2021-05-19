package com.example.track_me.databinding;
import com.example.track_me.R;
import com.example.track_me.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VerificationFragmentBindingLandImpl extends VerificationFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.device_name_TextView, 6);
        sViewsWithIds.put(R.id.inner_ConstraintLayout, 7);
        sViewsWithIds.put(R.id.location_imageView, 8);
        sViewsWithIds.put(R.id.latitude_TextView, 9);
        sViewsWithIds.put(R.id.longitude_TextView, 10);
        sViewsWithIds.put(R.id.elevation_imageView, 11);
        sViewsWithIds.put(R.id.elevation_TextView, 12);
        sViewsWithIds.put(R.id.inner_code_LinearLayout, 13);
        sViewsWithIds.put(R.id.requestVerification_Button, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VerificationFragmentBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private VerificationFragmentBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.Button) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.codeFourImageView.setTag(null);
        this.codeOneImageView.setTag(null);
        this.codeThreeImageView.setTag(null);
        this.codeTwoImageView.setTag(null);
        this.errorTextView.setTag(null);
        this.verificationLayout.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewModel((com.example.track_me.screens.verification.VerificationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.track_me.screens.verification.VerificationViewModel ViewModel) {
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
                return onChangeViewModelRanNumber((androidx.lifecycle.LiveData<int[]>) object, fieldId);
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
    private boolean onChangeViewModelRanNumber(androidx.lifecycle.LiveData<int[]> ViewModelRanNumber, int fieldId) {
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
        int viewModelRanNumber1 = 0;
        int viewModelRanNumber3 = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuccessGetValue = false;
        java.lang.Boolean viewModelIsSuccessGetValue = null;
        int viewModelRanNumber0 = 0;
        int viewModelRanNumber2 = 0;
        int[] viewModelRanNumberGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsSuccess = null;
        androidx.lifecycle.LiveData<int[]> viewModelRanNumber = null;
        com.example.track_me.screens.verification.VerificationViewModel viewModel = mViewModel;

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
                        // read viewModel.ranNumber
                        viewModelRanNumber = viewModel.getRanNumber();
                    }
                    updateLiveDataRegistration(1, viewModelRanNumber);


                    if (viewModelRanNumber != null) {
                        // read viewModel.ranNumber.getValue()
                        viewModelRanNumberGetValue = viewModelRanNumber.getValue();
                    }


                    if (viewModelRanNumberGetValue != null) {
                        // read viewModel.ranNumber.getValue()[1]
                        viewModelRanNumber1 = getFromArray(viewModelRanNumberGetValue, 1);
                        // read viewModel.ranNumber.getValue()[3]
                        viewModelRanNumber3 = getFromArray(viewModelRanNumberGetValue, 3);
                        // read viewModel.ranNumber.getValue()[0]
                        viewModelRanNumber0 = getFromArray(viewModelRanNumberGetValue, 0);
                        // read viewModel.ranNumber.getValue()[2]
                        viewModelRanNumber2 = getFromArray(viewModelRanNumberGetValue, 2);
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.track_me.utils.BindingUtlisKt.setCodeImage(this.codeFourImageView, viewModelRanNumber3);
            com.example.track_me.utils.BindingUtlisKt.setCodeImage(this.codeOneImageView, viewModelRanNumber0);
            com.example.track_me.utils.BindingUtlisKt.setCodeImage(this.codeThreeImageView, viewModelRanNumber2);
            com.example.track_me.utils.BindingUtlisKt.setCodeImage(this.codeTwoImageView, viewModelRanNumber1);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.errorTextView.setVisibility(viewModelIsSuccessViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isSuccess()
        flag 1 (0x2L): viewModel.ranNumber
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuccess().getValue()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuccess().getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}