package com.example.track_me.screens.verification

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.*
import com.example.track_me.dataBase.PreferencesManager
import com.example.track_me.models.UserDevice
import com.example.track_me.network.RetrofitClass
import com.example.track_me.utils.Constant.COUNT_ONE_MIN_TIME
import com.example.track_me.utils.Constant.ONE_SECOND
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.first
import javax.inject.Inject

@HiltViewModel
class VerificationViewModel @Inject constructor(private val preferencesManager: PreferencesManager) : ViewModel() {

    // The timer
    private lateinit var timer: CountDownTimer
    private val _waitingRequest = MutableLiveData<Boolean>()
    val waitingRequest: LiveData<Boolean>
        get() = _waitingRequest

    private val TAG = "VerificationViewModel"

    private val preferencesFlow = preferencesManager.preferencesFlow

    private var _isSuccess = MutableLiveData<Boolean>()
    val isSuccess: LiveData<Boolean>
        get() = _isSuccess

    private var _isVerified = MutableLiveData<Boolean>()
    val isVerified: LiveData<Boolean>
        get() = _isVerified

    private var ran: Int = 0

    private var _ranNumber = MutableLiveData<IntArray>()
    val ranNumber: LiveData<IntArray>
        get() = _ranNumber

    // Using LiveData and caching what allWords returns has several benefits:
    // - We can put an observer on the data (instead of polling for changes) and only update the
    //   the UI when the data actually changes.
    // - Repository is completely separated from the UI through the ViewModel.
    private var _userDevice = MutableLiveData<UserDevice>()
    val userDevice: LiveData<UserDevice>
            get() = _userDevice

    init {
        _isSuccess.value = true
        _waitingRequest.value = false
        _userDevice.value = UserDevice()
        getUserData()
        Log.d(TAG, "init UserDevice: ${_userDevice.value}")
        codeCreator()
    }

    private fun getUserData() = viewModelScope.launch {
        _userDevice.value?.name = preferencesFlow.first().deviceName
        _userDevice.value?.token = preferencesFlow.first().userToken
        _isVerified.value = !_userDevice.value?.token.isNullOrEmpty()
        Log.d(TAG, "getUserData: ${_isVerified.value}")
        Log.d(TAG, "getUserData: ${_userDevice.value}")
    }

    fun requestVerification() {
        viewModelScope.launch {
            try {
                val response = withContext(Dispatchers.IO) {
                    RetrofitClass.apiInterface.verify(
                        userDevice.value!!
                    )
                }
                Log.d(TAG, "requestVerification: " + response.body())
                _isSuccess.value = response.isSuccessful
                Log.d(TAG, "requestVerification:- response.code: ${response.code()}")
                _userDevice.value?.token = response.body()?.meta?.token!!
                saveUserData()
            } catch (e: Exception) {
                Log.e("Error", e.toString())
                _isSuccess.value = false
                _isVerified.value = false
                Log.d(TAG, "requestVerification: isSuccess " + _isSuccess.value)
                Log.d(TAG, "requestVerification: isVerified " + _isVerified.value)
            }
        }
    }

    fun startRequest() {
        timer = object : CountDownTimer(COUNT_ONE_MIN_TIME, ONE_SECOND) {
            override fun onTick(millisUntilFinished: Long) {
//                waiting for administrator to verify
                _waitingRequest.value = true
            }

            override fun onFinish() {
//                ready to request again
                _isSuccess.value = true
                _waitingRequest.value = false
            }
        }
        timer.start()
    }

    private fun codeCreator() {
        ran = (1000..9999).random()
        val string = ran.toString()
        val numbers = string.map { it.toString().toInt() }.toIntArray()
        _ranNumber.value = numbers
    }

    fun createUserDevice(deviceName: String, deviceId: String) {
        val newUserDevice = UserDevice()
        newUserDevice.hardware = deviceId
        newUserDevice.name = deviceName
        newUserDevice.code = ran
        _userDevice.value = newUserDevice
        Log.d(TAG, "createUserDevice: $newUserDevice")
    }

    private suspend fun saveUserData() = viewModelScope.launch {
        preferencesManager.updateDeviceName(_userDevice.value?.name!!)
        preferencesManager.updateToken(_userDevice.value?.token!!)
        _isVerified.value = !_userDevice.value?.token.isNullOrEmpty()
        Log.d(TAG, "saveUserData: Data is saved")
    }
}