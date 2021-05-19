package com.example.track_me.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/track_me/network/ApiInterface;", "", "submitLocation", "Lretrofit2/Response;", "Lcom/example/track_me/models/LocationResponse;", "token", "", "locationData", "Lcom/example/track_me/models/LocationData;", "(Ljava/lang/String;Lcom/example/track_me/models/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "Lcom/example/track_me/models/Device;", "userDevice", "Lcom/example/track_me/models/UserDevice;", "(Lcom/example/track_me/models/UserDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/location/create")
    public abstract java.lang.Object submitLocation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.track_me.models.LocationData locationData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.track_me.models.LocationResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/device/create")
    public abstract java.lang.Object verify(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.track_me.models.UserDevice userDevice, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.track_me.models.Device>> p1);
}