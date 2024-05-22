package com.novatech.mobiledependencyapp

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {
    init {
        Log.i("TAGY", "battery created")
    }
    fun displayBatteryPower(){
        Log.i("TAGY", "battery is 100%")
    }

}