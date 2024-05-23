package com.novatech.mobiledependencyapp

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider:ServiceProvider) {

    init {
        Log.i("TAGY", "sim card created")
    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}