package com.example.track_me.network

import com.example.track_me.models.Device
import com.example.track_me.models.LocationData
import com.example.track_me.models.LocationResponse
import com.example.track_me.models.UserDevice
import retrofit2.Response
import retrofit2.http.*

interface ApiInterface {

    @POST("user/location/create")
    suspend fun submitLocation(
        @Header("Authorization") token: String,
        @Body locationData: LocationData
    ): Response<LocationResponse>

    @POST("user/device/create")
    suspend fun verify(
        @Body userDevice: UserDevice
    ): Response<Device>
}