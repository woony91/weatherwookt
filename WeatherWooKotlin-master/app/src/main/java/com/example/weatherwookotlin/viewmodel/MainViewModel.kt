package com.example.weatherwookotlin.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.weatherwookotlin.model.WeatherResponse
import com.example.weatherwookotlin.repository.Repository
import retrofit2.Call

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repo = Repository

    fun getWeatherCall(latitude: String, longitude: String) : Call<WeatherResponse> =
        repo.getWeatherCall(latitude, longitude)

}