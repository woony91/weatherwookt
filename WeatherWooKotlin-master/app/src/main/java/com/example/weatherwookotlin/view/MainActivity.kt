package com.example.weatherwookotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherwookotlin.R
import com.example.weatherwookotlin.adapter.DailyAdapter
import com.example.weatherwookotlin.commons.toast
import com.example.weatherwookotlin.model.Daily
import com.example.weatherwookotlin.model.Hourly
import com.example.weatherwookotlin.model.WeatherResponse
import com.example.weatherwookotlin.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        setupHourlyRV()
        setupDailyRV()
        loadWeather()
    }

    private fun setupHourlyRV() {
        rv_hourly.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_hourly.setHasFixedSize(true)
        rv_hourly.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL))
    }

    private fun setupDailyRV() {
        rv_daily.layoutManager = LinearLayoutManager(this)
        rv_daily.setHasFixedSize(true)
        rv_daily.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

    private fun loadWeather() {
        viewModel.getWeatherCall("9.081999", "8.675277")
            .enqueue(object : Callback<WeatherResponse> {
                override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                    "SUCCESS".toast(this@MainActivity)
                    val weatherResponse = response.body()
                    weatherResponse?.let { weather ->
                        loadCurrently(weather)
                        loadHourly(weather.hourly)
                        loadDaily(weather.daily)
                    }
                }

                override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                    "FAILURE".toast(this@MainActivity)
                }
            })
    }

    fun loadCurrently(weatherResponse: WeatherResponse) {
        tv_city.text = weatherResponse.timezone
    }

    fun loadHourly(hourly: Hourly) {

    }

    fun loadDaily(daily: Daily) {
        val adapter = DailyAdapter(daily.data)
        rv_daily.adapter = adapter
    }
}