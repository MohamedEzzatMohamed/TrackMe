package com.example.track_me.screens.location

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.track_me.R
import com.example.track_me.databinding.LocationFragmentBinding
import com.example.track_me.utils.Constant.LOCATION_REQUEST
import android.location.LocationManager
import android.provider.Settings
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.track_me.screens.verification.VerificationFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

/**
 * Fragment where the game is played
 */

@AndroidEntryPoint
class LocationFragment : Fragment() {

    private val TAG = "LocationFragment"

    private lateinit var locationViewModel: LocationViewModel

    private lateinit var binding: LocationFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.location_fragment,
            container,
            false
        )

        val arguments = LocationFragmentArgs.fromBundle(requireArguments())

        Log.d(TAG, "arguments ${arguments.userDevice}")
        locationViewModel = ViewModelProvider(this).get(LocationViewModel::class.java)

        binding.lifecycleOwner = this
        binding.viewModel = locationViewModel

        binding.userDeviceNameTextView.text = arguments.userDevice.name

        locationViewModel.timeSelected.observe(viewLifecycleOwner, {
            setSelectedView(it)
        })

        locationViewModel.getUserToken("Token ${arguments.userDevice.token}")

        prepRequestLocationUpdates()

        binding.updateNowButton.setOnClickListener(View.OnClickListener {
            prepRequestLocationUpdates()
        })

        locationViewModel.isAuthorized.observe(viewLifecycleOwner, Observer { authorized ->
            if (!authorized) {
                this.findNavController().navigate(
                    LocationFragmentDirections.actionLocationDestinationToVerificationDestination(),
                    NavOptions.Builder()
                        .setPopUpTo(
                            R.id.location_destination,
                            true
                        ).build()
                )
            }
        })

        return binding.root
    }

    private fun prepRequestLocationUpdates() {

        when {
            !isLocationEnabled() -> showGPSDialog()

            isPermissionsGranted() -> requestLocationUpdates()

            else -> ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                LOCATION_REQUEST
            )
        }

    }

    private fun requestLocationUpdates() {
        locationViewModel.getLocationLiveData()
            .observe(viewLifecycleOwner, Observer { locationData ->
                binding.latitudeTextView.text = locationData.latitude.toString()
                binding.longitudeTextView.text = locationData.longitude.toString()
                binding.elevationTextView.text = locationData.elevation_m.toString()
            })
//        locationViewModel.sendLocation()
        locationViewModel.restartTimer()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            LOCATION_REQUEST -> {
                prepRequestLocationUpdates()
            }
        }
        Log.d(TAG, "onRequestPermissionsResult")
    }


    //TODO("use this 2 functions to check if request is access or denied from the user and set the start timer")
    private fun isPermissionsGranted() =
        ActivityCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED

    private fun isLocationEnabled(): Boolean {
        //this function will return to us the state of the location service
        //if the gps or the network provider is enabled then it will return true otherwise it will return false
        val locationManager =
            requireActivity().getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
            LocationManager.NETWORK_PROVIDER
        )
    }

    private fun showGPSDialog() {
        val builder = AlertDialog.Builder(requireContext())

        // Set the alert dialog title
        builder.setTitle("Open GPS")

        // Display a message on alert dialog
        builder.setMessage("Turn on GPS?")

        // Set a positive button and its click listener on alert dialog
        builder.setPositiveButton("YES") { _, _ ->
            // Do something when user press the positive button
            startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS))
        }

        // Display a negative button on alert dialog
        builder.setNegativeButton("No") { _, _ ->
            Toast.makeText(
                requireContext(),
                getString(R.string.gps_off_message),
                Toast.LENGTH_SHORT
            ).show()
        }

        // Finally, make the alert dialog using builder
        val dialog: AlertDialog = builder.create()

        // Display the alert dialog on app interface
        dialog.show()
    }

    private fun setSelectedView(it: Int?) {
        when (it) {
            1 -> {
                binding.oneImageView.setBackgroundResource(R.drawable.option_selected_shadow)
                binding.threeImageView.background = null
                binding.fiveImageView.background = null
                binding.sevenImageView.background = null
            }
            3 -> {
                binding.threeImageView.setBackgroundResource(R.drawable.option_selected_shadow)
                binding.oneImageView.background = null
                binding.fiveImageView.background = null
                binding.sevenImageView.background = null
            }
            5 -> {
                binding.fiveImageView.setBackgroundResource(R.drawable.option_selected_shadow)
                binding.oneImageView.background = null
                binding.threeImageView.background = null
                binding.sevenImageView.background = null
            }
            7 -> {
                binding.sevenImageView.setBackgroundResource(R.drawable.option_selected_shadow)
                binding.oneImageView.background = null
                binding.threeImageView.background = null
                binding.fiveImageView.background = null
            }
        }
    }
}
