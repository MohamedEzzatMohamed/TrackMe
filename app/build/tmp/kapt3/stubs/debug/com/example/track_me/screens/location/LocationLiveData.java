package com.example.track_me.screens.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0015J\b\u0010\r\u001a\u00020\fH\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0003R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/track_me/screens/location/LocationLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/example/track_me/models/LocationData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "kotlin.jvm.PlatformType", "locationCallBack", "Lcom/google/android/gms/location/LocationCallback;", "onActive", "", "onInactive", "setLocationData", "location", "Landroid/location/Location;", "startLocationUpdates", "Companion", "app_debug"})
public final class LocationLiveData extends androidx.lifecycle.LiveData<com.example.track_me.models.LocationData> {
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private final com.google.android.gms.location.LocationCallback locationCallBack = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.android.gms.location.LocationRequest locationRequest = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.track_me.screens.location.LocationLiveData.Companion Companion = null;
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    protected void onActive() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationUpdates() {
    }
    
    /**
     * If we've received a location update, this function will be called.
     */
    private final void setLocationData(android.location.Location location) {
    }
    
    public LocationLiveData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/track_me/screens/location/LocationLiveData$Companion;", "", "()V", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.location.LocationRequest getLocationRequest() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}