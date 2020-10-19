package com.example.weatherwookotlin.model

import com.google.gson.annotations.SerializedName

data class WeatherResponse(

    @field:SerializedName("latitude")
    val latitude: Double? = null,

    @field:SerializedName("longitude")
    val longitude: Double? = null,

    @field:SerializedName("timezone")
    val timezone: String = "",

    @field:SerializedName("currently")
    val currently: Currently = Currently(),

    @field:SerializedName("hourly")
    val hourly: Hourly = Hourly(),

    @field:SerializedName("daily")
    val daily: Daily = Daily(),

    @field:SerializedName("offset")
    val offset: Int? = null
)