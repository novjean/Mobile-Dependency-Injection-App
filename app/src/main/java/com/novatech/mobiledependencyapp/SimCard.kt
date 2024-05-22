package com.novatech.mobiledependencyapp

import android.util.Log

class SimCard(private val serviceProvider: ServiceProvider) {

    
    init {
        Log.i("TAGY", "sim card created")
    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}