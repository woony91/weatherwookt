package com.example.weatherwookotlin.repository.remote

import com.example.weatherwookotlin.model.WeatherResponse
import com.example.weatherwookotlin.repository.remote.RemoteConstants.WEATHER_PATH
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET(WEATHER_PATH)
    fun getWeather(
        @Path("apiKey") apiKey: String,
        @Path("latitude") latitude: String,
        @Path("longitude") longitude: String
    ): Call<WeatherResponse>

}