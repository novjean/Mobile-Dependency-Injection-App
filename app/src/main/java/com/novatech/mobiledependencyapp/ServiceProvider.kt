package com.novatech.mobiledependencyapp

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        Log.i("TAGY", "service provider created")
    }
    fun getServiceProvider() {
        Log.i("TAGY", "service provider connected successfully")
    }
}