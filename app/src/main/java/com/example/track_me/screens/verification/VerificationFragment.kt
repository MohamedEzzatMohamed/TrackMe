package com.example.track_me.screens.verification

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.track_me.R
import com.example.track_me.databinding.VerificationFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

/**
 * Fragment for the starting or title screen of the app
 */
@AndroidEntryPoint
class VerificationFragment : Fragment() {

    private val TAG = "VerificationFragment"

//    private lateinit var viewModel: VerificationViewModel

    private val viewModel: VerificationViewModel by lazy {
        ViewModelProvider(this).get(VerificationViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: VerificationFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.verification_fragment, container, false
        )

        binding.lifecycleOwner = this

        // Giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel

        val deviceId = UUID.randomUUID().toString()
        Log.d(TAG, "onCreateView: devideID = $deviceId")
        val deviceName = Build.MODEL
        binding.deviceNameTextView.text = deviceName

        viewModel.waitingRequest.observe(viewLifecycleOwner, Observer {
            binding.requestVerificationButton.isEnabled = !it
        })

        binding.requestVerificationButton.setOnClickListener {
            viewModel.startRequest()
            viewModel.createUserDevice(deviceName, deviceId)
            viewModel.requestVerification()
        }

        viewModel.isVerified.observe(viewLifecycleOwner, Observer {
            if (it) {
                Log.d(TAG, "onCreateView: ${viewModel.userDevice.value}")
                this.findNavController().navigate(
                    VerificationFragmentDirections.actionVerificationToLocation(viewModel.userDevice.value!!),
                    NavOptions.Builder()
                        .setPopUpTo(
                            R.id.verification_destination,
                            true
                        ).build()
                )
            }
        })

        return binding.root
    }
}
