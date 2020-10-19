package com.example.weatherwookotlin.commons

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.weatherwookotlin.BuildConfig

fun Any.toast(context: Context, duration: Int = Toast.LENGTH_SHORT): Toast {
    return Toast.makeText(context, this.toString(), duration).apply { show() }
}

fun Context.logd(message: String) {
    if (BuildConfig.DEBUG) Log.d(this::class.java.simpleName, message)
}