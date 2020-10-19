package com.example.weatherwookotlin.model

import com.google.gson.annotations.SerializedName

data class Daily(

    @field:SerializedName("summary")
    val summary: String? = null,

    @field:SerializedName("icon")
    val icon: String? = null,

    @field:SerializedName("data")
    val data: List<DailyData> = listOf()
)