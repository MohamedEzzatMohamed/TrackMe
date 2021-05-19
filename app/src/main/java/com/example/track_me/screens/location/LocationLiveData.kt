package com.example.track_me.screens.location

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import androidx.lifecycle.LiveData
import com.example.track_me.models.LocationData
import com.example.track_me.utils.Constant.COUNT_ONE_MIN_TIME
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices

class LocationLiveData(context: Context) : LiveData<LocationData>() {

    private var fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)

    override fun onInactive() {
        super.onInactive()
        fusedLocationClient.removeLocationUpdates(locationCallBack)
    }

    @SuppressLint("MissingPermission")
    override fun onActive() {
        super.onActive()
        fusedLocationClient.lastLocation
            .addOnSuccessListener { location: Location? ->
                location?.also {
                    setLocationData(it)
                }
            }
        startLocationUpdates()
    }


    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            locationCallBack,
            null
        )
    }

    private val locationCallBack = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult?) {
            locationResult ?: return
            for (location in locationResult.locations) {
                setLocationData(location)
            }
        }
    }

    /**
     * If we've received a location update, this function will be called.
     */
    private fun setLocationData(location: Location) {
        value = LocationData(longitude = location.longitude, latitude = location.latitude, elevation_m = location.speed.toDouble())
    }

    companion object{
        val locationRequest: LocationRequest = LocationRequest.create().apply {
            interval = COUNT_ONE_MIN_TIME
            fastestInterval = COUNT_ONE_MIN_TIME/4
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        }
    }
}
