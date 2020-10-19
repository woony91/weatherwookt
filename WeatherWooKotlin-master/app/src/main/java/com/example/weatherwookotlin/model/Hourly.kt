package com.example.weatherwookotlin.model

import com.google.gson.annotations.SerializedName

data class Hourly(

    @field:SerializedName("summary")
    val summary: String? = null,

    @field:SerializedName("icon")
    val icon: String? = null,

    @field:SerializedName("data")
    val data: List<HourlyData?>? = null
)