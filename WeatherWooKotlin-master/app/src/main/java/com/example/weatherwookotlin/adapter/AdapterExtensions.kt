package com.example.weatherwookotlin.adapter

import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import java.util.*

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

fun Long.toDayOfWeek(): String {
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = this * 1000
    return DateFormat.format("EEEE", calendar).toString()
}
