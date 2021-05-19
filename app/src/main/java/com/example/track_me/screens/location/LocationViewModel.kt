package com.example.track_me.screens.location

import android.app.Application
import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.*
import com.example.track_me.dataBase.PreferencesManager
import com.example.track_me.models.LocationData
import com.example.track_me.network.RetrofitClass
import com.example.track_me.utils.Constant
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LocationViewModel @Inject constructor(application: Application, private val preferencesManager: PreferencesManager) : AndroidViewModel(application) {

    private val locationLiveData = LocationLiveData(application)
    fun getLocationLiveData() = locationLiveData

    // The timer
    private lateinit var timer: CountDownTimer

    private lateinit var userToken:String

    private val _waitingTime = MutableLiveData<Boolean>()
    val waitingTime: LiveData<Boolean>
        get() = _waitingTime

    private val _timerStart = MutableLiveData<Boolean>()
    private val timerStart: LiveData<Boolean>
        get() = _timerStart

    var minSelected = Constant.COUNT_ONE_MIN_TIME

    private val TAG = "LocationViewModel"

    private var _isSuccess = MutableLiveData<Boolean>()
    val isSuccess: LiveData<Boolean>
        get() = _isSuccess

    private var _isAuthorized = MutableLiveData<Boolean>()
    val isAuthorized: LiveData<Boolean>
        get() = _isAuthorized

    private val preferencesFlow = preferencesManager.preferencesFlow

    private var _timeSelected = MutableLiveData<Int>()
    val timeSelected: LiveData<Int>
        get() = _timeSelected

//    private var _locationData = MutableLiveData<LocationData>()

    init {
        Log.d(TAG, "initialization: ")
        _isSuccess.value = true
        _timeSelected.value = 1
        _timerStart.value = false
        _isAuthorized.value = true
//        startTimer(minSelected)
    }

    private fun sendLocation() {
        Log.d(TAG, "sendLocation: is Called")
        Log.d(TAG, userToken)
        viewModelScope.launch {
            try {
                val response = withContext(Dispatchers.IO) {
                    RetrofitClass.apiInterface.submitLocation(
                        userToken,
                        getLocationLiveData().value!!
                    )
                }
//                Log.d(TAG, "sendLocation: " + response.body())
//                _locationData.value = response.body()
                if (response.code() == 401)
                    removeToken()

                _isSuccess.value = response.isSuccessful

                Log.d(TAG, "code: ${response.code()}")
                Log.d(TAG, "isSuccess: ${response.isSuccessful}")
            } catch (e: Exception) {
                Log.d(TAG, "Error ${e.toString()}")
            }
        }
    }

    fun startTimer(minutes: Long) {
        sendLocation()
        _timerStart.value = true
        timer = object : CountDownTimer(minutes, Constant.ONE_SECOND) {
            override fun onTick(millisUntilFinished: Long) {
//                waiting for administrator to verify
                when {
                    (minSelected - millisUntilFinished) < (Constant.COUNT_ONE_MIN_TIME / 2) -> {
                        _waitingTime.value = true
                    }
                    else -> {
                        _waitingTime.value = false
                    }
                }
            }
            override fun onFinish() {
//                ready to request again
                _isSuccess.value = true
                _waitingTime.value = false
//                sendLocation()
                startTimer(minSelected)
            }
        }
        timer.start()
    }

    fun setTimeSelected(time: Int) {
        _timeSelected.value = time
        minSelected = when (time) {
            1 -> Constant.COUNT_ONE_MIN_TIME
            3 -> Constant.COUNT_THREE_MIN_TIME
            5 -> Constant.COUNT_FIVE_MIN_TIME
            7 -> Constant.COUNT_SEVEN_MIN_TIME
            else -> Constant.COUNT_ONE_MIN_TIME
        }
    }

    fun getUserToken(userToken: String){
        this.userToken = userToken
    }

    private suspend fun removeToken() = viewModelScope.launch {
        preferencesManager.updateToken("")
        preferencesManager.updateDeviceName("")
        _isAuthorized.value = false
        Log.d(TAG, "saveUserData: token is removed")
    }

    private fun stopTimer() {
        if (timerStart.value!!){
            timer.cancel()
        }
    }

    fun restartTimer(){
        stopTimer()
        startTimer(minSelected)
    }

    override fun onCleared() {
        super.onCleared()
        stopTimer()
    }
}