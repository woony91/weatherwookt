package com.example.weatherwookotlin.repository.remote

object RemoteConstants {
    const val BASE_URL = "https://api.darksky.net"
    const val WEATHER_PATH = "/forecast/{apiKey}/{longitude},{latitude}?exclude=[minutely,alerts,flags]"
    const val API_KEY = ""
}