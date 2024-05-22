package com.novatech.mobiledependencyapp

import android.util.Log

class Mobile(val battery: Battery, val simCard: SimCard, val display: Display) {
    init {
        battery.displayBatteryPower()
        simCard.connectToNetwork()
        display.turnOnScreen()

        Log.i("TAGY", "mobile is created successfully")
    }

    fun turnOnMobile(){
        Log.i("TAGY", "mobile is turned on")
    }
}