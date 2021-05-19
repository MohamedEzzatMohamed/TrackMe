package com.example.track_me.screens.location

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.track_me.models.UserDevice
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class LocationFragmentArgs(val userDevice: UserDevice) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(UserDevice::class.java)) {
            result.putParcelable("userDevice", this.userDevice as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(UserDevice::class.java)) {
            result.putSerializable("userDevice", this.userDevice as Serializable)
        } else {
            throw UnsupportedOperationException(UserDevice::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): LocationFragmentArgs {
            bundle.setClassLoader(LocationFragmentArgs::class.java.classLoader)
            val __userDevice : UserDevice?
            if (bundle.containsKey("userDevice")) {
                if (Parcelable::class.java.isAssignableFrom(UserDevice::class.java) ||
                        Serializable::class.java.isAssignableFrom(UserDevice::class.java)) {
                    __userDevice = bundle.get("userDevice") as UserDevice?
                } else {
                    throw UnsupportedOperationException(UserDevice::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__userDevice == null) {
                    throw IllegalArgumentException("Argument \"userDevice\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"userDevice\" is missing and does not have an android:defaultValue")
            }
            return LocationFragmentArgs(__userDevice)
        }
    }
}
