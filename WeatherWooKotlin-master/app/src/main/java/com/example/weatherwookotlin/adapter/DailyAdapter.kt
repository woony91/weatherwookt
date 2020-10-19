package com.example.weatherwookotlin.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherwookotlin.R
import com.example.weatherwookotlin.commons.logd
import com.example.weatherwookotlin.model.DailyData
import kotlinx.android.synthetic.main.daily_item.view.*
import kotlin.math.roundToInt

class DailyAdapter(private val dailyList: List<DailyData>) : RecyclerView.Adapter<DailyAdapter.DailyViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder {
        context = parent.context
        val view = parent.inflate(R.layout.daily_item)
        return DailyViewHolder(view)
    }

    override fun onBindViewHolder(holder: DailyViewHolder, position: Int) {
        val dailyData = dailyList[position]
        holder.loadDaily(dailyData)
    }

    override fun getItemCount(): Int = dailyList.count()

    class DailyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun loadDaily(dailyHourlyData: DailyData) {
            view.tv_Time.text = dailyHourlyData.time?.toDayOfWeek()
            view.tv_High.text = dailyHourlyData.temperatureHigh?.roundToInt().toString()
            view.tv_Low.text = dailyHourlyData.temperatureLow?.roundToInt().toString()
        }
    }
}