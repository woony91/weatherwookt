package com.example.weatherwookotlin.repository

import com.example.weatherwookotlin.model.WeatherResponse
import com.example.weatherwookotlin.repository.remote.RemoteConstants.API_KEY
import com.example.weatherwookotlin.repository.remote.RetrofitInstance
import com.example.weatherwookotlin.repository.remote.WeatherService
import retrofit2.Call

object Repository {

    private val service = RetrofitInstance.retrofit.create(WeatherService::class.java)

    fun getWeatherCall(latitude: String, longitude: String) : Call<WeatherResponse> =
        service.getWeather(API_KEY, latitude, longitude)

}