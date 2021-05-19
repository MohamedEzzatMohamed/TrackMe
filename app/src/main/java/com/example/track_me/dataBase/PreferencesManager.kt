package com.example.track_me.dataBase

import android.content.Context
import android.util.Log
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.preferencesKey
import androidx.datastore.preferences.createDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "PreferencesManager"

data class FilterPreferences(val deviceName: String, val userToken: String)

@Singleton
class PreferencesManager @Inject constructor(@ApplicationContext context: Context) {

    private val dataStore = context.createDataStore("user_preferences")

    val preferencesFlow = dataStore.data
        .catch { exception ->
            if (exception is IOException) {
                Log.e(TAG, "Error reading preferences", exception)
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }
        .map { preferences ->
            val deviceName = preferences[PreferencesKeys.DEVICE_NAME] ?: ""

            val userToken = preferences[PreferencesKeys.USER_TOKEN] ?: ""
            FilterPreferences(deviceName, userToken)
        }

    suspend fun updateDeviceName(deviceName: String) {
        dataStore.edit { preferences ->
            preferences[PreferencesKeys.DEVICE_NAME] = deviceName
        }
    }

    suspend fun updateToken(userToken: String) {
        dataStore.edit { preferences ->
            preferences[PreferencesKeys.USER_TOKEN] = userToken
        }
    }

    private object PreferencesKeys {
        val DEVICE_NAME = preferencesKey<String>("device_name")
        val USER_TOKEN = preferencesKey<String>("user_token")
    }
}