package com.example.track_me.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserDevice(
    var name: String = "DeviceName",
    var code: Int = 1234,
    var hardware: String = "DeviceId",
    var token: String = ""
) : Parcelable