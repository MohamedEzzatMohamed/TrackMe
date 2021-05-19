package com.example.track_me.screens.location;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010)\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\bJ\b\u0010,\u001a\u00020+H\u0014J\u0011\u0010-\u001a\u00020.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020+J\b\u00101\u001a\u00020+H\u0002J\u000e\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\u000eJ\u000e\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\u0018J\b\u00106\u001a\u00020+H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u000e\u0010&\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/example/track_me/screens/location/LocationViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "preferencesManager", "Lcom/example/track_me/dataBase/PreferencesManager;", "(Landroid/app/Application;Lcom/example/track_me/dataBase/PreferencesManager;)V", "TAG", "", "_isAuthorized", "Landroidx/lifecycle/MutableLiveData;", "", "_isSuccess", "_timeSelected", "", "_timerStart", "_waitingTime", "isAuthorized", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isSuccess", "locationLiveData", "Lcom/example/track_me/screens/location/LocationLiveData;", "minSelected", "", "getMinSelected", "()J", "setMinSelected", "(J)V", "preferencesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/track_me/dataBase/FilterPreferences;", "timeSelected", "getTimeSelected", "timer", "Landroid/os/CountDownTimer;", "timerStart", "getTimerStart", "userToken", "waitingTime", "getWaitingTime", "getLocationLiveData", "getUserToken", "", "onCleared", "removeToken", "Lkotlinx/coroutines/Job;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restartTimer", "sendLocation", "setTimeSelected", "time", "startTimer", "minutes", "stopTimer", "app_release"})
public final class LocationViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.track_me.screens.location.LocationLiveData locationLiveData = null;
    private android.os.CountDownTimer timer;
    private java.lang.String userToken;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _waitingTime = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _timerStart = null;
    private long minSelected = 60000L;
    private final java.lang.String TAG = "LocationViewModel";
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isSuccess;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isAuthorized;
    private final kotlinx.coroutines.flow.Flow<com.example.track_me.dataBase.FilterPreferences> preferencesFlow = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _timeSelected;
    private final com.example.track_me.dataBase.PreferencesManager preferencesManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.track_me.screens.location.LocationLiveData getLocationLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getWaitingTime() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.lang.Boolean> getTimerStart() {
        return null;
    }
    
    public final long getMinSelected() {
        return 0L;
    }
    
    public final void setMinSelected(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isAuthorized() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTimeSelected() {
        return null;
    }
    
    private final void sendLocation() {
    }
    
    public final void startTimer(long minutes) {
    }
    
    public final void setTimeSelected(int time) {
    }
    
    public final void getUserToken(@org.jetbrains.annotations.NotNull()
    java.lang.String userToken) {
    }
    
    private final void stopTimer() {
    }
    
    public final void restartTimer() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public LocationViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.track_me.dataBase.PreferencesManager preferencesManager) {
        super(null);
    }
}