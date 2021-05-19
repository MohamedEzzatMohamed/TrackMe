package com.example.track_me.screens.verification;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\u0016\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006J\b\u0010&\u001a\u00020\'H\u0002J\u0006\u0010(\u001a\u00020\"J\u0011\u0010)\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\"R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/example/track_me/screens/verification/VerificationViewModel;", "Landroidx/lifecycle/ViewModel;", "preferencesManager", "Lcom/example/track_me/dataBase/PreferencesManager;", "(Lcom/example/track_me/dataBase/PreferencesManager;)V", "TAG", "", "_isSuccess", "Landroidx/lifecycle/MutableLiveData;", "", "_isVerified", "_ranNumber", "", "_userDevice", "Lcom/example/track_me/models/UserDevice;", "_waitingRequest", "isSuccess", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isVerified", "preferencesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/track_me/dataBase/FilterPreferences;", "ran", "", "ranNumber", "getRanNumber", "timer", "Landroid/os/CountDownTimer;", "userDevice", "getUserDevice", "waitingRequest", "getWaitingRequest", "codeCreator", "", "createUserDevice", "deviceName", "deviceId", "getUserData", "Lkotlinx/coroutines/Job;", "requestVerification", "saveUserData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startRequest", "app_release"})
public final class VerificationViewModel extends androidx.lifecycle.ViewModel {
    private android.os.CountDownTimer timer;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _waitingRequest = null;
    private final java.lang.String TAG = "VerificationViewModel";
    private final kotlinx.coroutines.flow.Flow<com.example.track_me.dataBase.FilterPreferences> preferencesFlow = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isSuccess;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isVerified;
    private int ran = 0;
    private androidx.lifecycle.MutableLiveData<int[]> _ranNumber;
    private androidx.lifecycle.MutableLiveData<com.example.track_me.models.UserDevice> _userDevice;
    private final com.example.track_me.dataBase.PreferencesManager preferencesManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getWaitingRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isVerified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<int[]> getRanNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.track_me.models.UserDevice> getUserDevice() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getUserData() {
        return null;
    }
    
    public final void requestVerification() {
    }
    
    public final void startRequest() {
    }
    
    private final void codeCreator() {
    }
    
    public final void createUserDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String deviceName, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceId) {
    }
    
    @javax.inject.Inject()
    public VerificationViewModel(@org.jetbrains.annotations.NotNull()
    com.example.track_me.dataBase.PreferencesManager preferencesManager) {
        super();
    }
}