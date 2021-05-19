package com.example.track_me.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocationData(
    var latitude: Double,
    var longitude: Double,
    var elevation_m: Double,
) : Parcelable

