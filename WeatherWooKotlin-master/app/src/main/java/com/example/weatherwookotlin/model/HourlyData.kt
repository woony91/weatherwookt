package com.example.weatherwookotlin.model

import com.google.gson.annotations.SerializedName

data class HourlyData(

	@field:SerializedName("summary")
	val summary: String = "",

	@field:SerializedName("precipProbability")
	val precipProbability: Double? = null,

	@field:SerializedName("visibility")
	val visibility: Double = 0.0,

	@field:SerializedName("windGust")
	val windGust: Double? = null,

	@field:SerializedName("precipIntensity")
	val precipIntensity: Double? = null,

	@field:SerializedName("icon")
	val icon: String = "",

	@field:SerializedName("cloudCover")
	val cloudCover: Double = 0.0,

	@field:SerializedName("windBearing")
	val windBearing: Double = 0.0,

	@field:SerializedName("apparentTemperature")
	val apparentTemperature: Double? = null,

	@field:SerializedName("pressure")
	val pressure: Double? = null,

	@field:SerializedName("dewPoint")
	val dewPoint: Double? = null,

	@field:SerializedName("ozone")
	val ozone: Double? = null,

	@field:SerializedName("precipType")
	val precipType: String = "",

	@field:SerializedName("temperature")
	val temperature: Double? = null,

	@field:SerializedName("humidity")
	val humidity: Double? = null,

	@field:SerializedName("time")
	val time: Long? = null,

	@field:SerializedName("windSpeed")
	val windSpeed: Double? = null,

	@field:SerializedName("uvIndex")
	val uvIndex: Double = 0.0
)