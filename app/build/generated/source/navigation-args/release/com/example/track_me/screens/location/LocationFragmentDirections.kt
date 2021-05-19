package com.example.track_me.screens.location

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.track_me.R

class LocationFragmentDirections private constructor() {
    companion object {
        fun actionLocationDestinationToVerificationDestination(): NavDirections =
                ActionOnlyNavDirections(R.id.action_location_destination_to_verification_destination)
    }
}
