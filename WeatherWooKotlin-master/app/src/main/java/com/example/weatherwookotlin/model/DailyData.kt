package com.example.weatherwookotlin.model

import com.google.gson.annotations.SerializedName

data class DailyData(

	@field:SerializedName("windGust")
	val windGust: Double? = null,

	@field:SerializedName("apparentTemperatureMinTime")
	val apparentTemperatureMinTime:Double = 0.0,

	@field:SerializedName("temperatureMax")
	val temperatureMax: Double? = null,

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("precipIntensityMax")
	val precipIntensityMax: Double? = null,

	@field:SerializedName("windBearing")
	val windBearing:Double = 0.0,

	@field:SerializedName("ozone")
	val ozone: Double? = null,

	@field:SerializedName("temperatureMaxTime")
	val temperatureMaxTime:Double = 0.0,

	@field:SerializedName("apparentTemperatureMin")
	val apparentTemperatureMin: Double? = null,

	@field:SerializedName("sunsetTime")
	val sunsetTime:Double = 0.0,

	@field:SerializedName("temperatureLow")
	val temperatureLow: Double? = null,

	@field:SerializedName("precipType")
	val precipType: String? = null,

	@field:SerializedName("humidity")
	val humidity: Double? = null,

	@field:SerializedName("moonPhase")
	val moonPhase: Double? = null,

	@field:SerializedName("windSpeed")
	val windSpeed: Double? = null,

	@field:SerializedName("apparentTemperatureLowTime")
	val apparentTemperatureLowTime:Double = 0.0,

	@field:SerializedName("sunriseTime")
	val sunriseTime:Double = 0.0,

	@field:SerializedName("apparentTemperatureLow")
	val apparentTemperatureLow: Double? = null,

	@field:SerializedName("summary")
	val summary: String? = null,

	@field:SerializedName("precipProbability")
	val precipProbability: Double? = null,

	@field:SerializedName("temperatureHighTime")
	val temperatureHighTime:Double = 0.0,

	@field:SerializedName("visibility")
	val visibility: Double? = null,

	@field:SerializedName("precipIntensity")
	val precipIntensity: Double? = null,

	@field:SerializedName("cloudCover")
	val cloudCover: Double? = null,

	@field:SerializedName("temperatureMin")
	val temperatureMin: Double? = null,

	@field:SerializedName("apparentTemperatureHighTime")
	val apparentTemperatureHighTime:Double = 0.0,

	@field:SerializedName("pressure")
	val pressure: Double? = null,

	@field:SerializedName("dewPoint")
	val dewPoint: Double? = null,

	@field:SerializedName("temperatureMinTime")
	val temperatureMinTime:Double = 0.0,

	@field:SerializedName("uvIndexTime")
	val uvIndexTime: Double = 0.0,

	@field:SerializedName("apparentTemperatureMax")
	val apparentTemperatureMax: Double? = null,

	@field:SerializedName("temperatureHigh")
	val temperatureHigh: Double? = null,

	@field:SerializedName("temperatureLowTime")
	val temperatureLowTime:Double = 0.0,

	@field:SerializedName("apparentTemperatureHigh")
	val apparentTemperatureHigh: Double? = null,

	@field:SerializedName("time")
	val time: Long? = null,

	@field:SerializedName("precipIntensityMaxTime")
	val precipIntensityMaxTime:Double = 0.0,

	@field:SerializedName("windGustTime")
	val windGustTime: Double = 0.0,

	@field:SerializedName("uvIndex")
	val uvIndex:Double = 0.0,

	@field:SerializedName("apparentTemperatureMaxTime")
	val apparentTemperatureMaxTime:Double = 0.0
)