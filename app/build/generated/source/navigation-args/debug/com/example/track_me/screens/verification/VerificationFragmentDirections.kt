package com.example.track_me.screens.verification

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.track_me.R
import com.example.track_me.models.UserDevice
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class VerificationFragmentDirections private constructor() {
    private data class ActionVerificationToLocation(val userDevice: UserDevice) : NavDirections {
        override fun getActionId(): Int = R.id.action_verification_to_location

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
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
    }

    companion object {
        fun actionVerificationToLocation(userDevice: UserDevice): NavDirections =
                ActionVerificationToLocation(userDevice)
    }
}
