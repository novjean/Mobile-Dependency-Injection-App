package com.novatech.mobiledependencyapp

import android.util.Log

class SimCard() {
    private lateinit var serviceProvider: ServiceProvider

    fun setServiceProvider(serviceProvider: ServiceProvider){
        this.serviceProvider = serviceProvider
    }

    init {
        Log.i("TAGY", "sim card created")
    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}