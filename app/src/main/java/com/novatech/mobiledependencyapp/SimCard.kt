package com.novatech.mobiledependencyapp

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor() {
    public lateinit var serviceProvider: ServiceProvider

//    fun setServiceProvider(serviceProvider: ServiceProvider){
//        this.serviceProvider = serviceProvider
//    }

    init {
        Log.i("TAGY", "sim card created")
    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}