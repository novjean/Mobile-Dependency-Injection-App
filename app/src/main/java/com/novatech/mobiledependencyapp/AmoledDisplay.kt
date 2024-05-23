package com.novatech.mobiledependencyapp

import android.util.Log
import javax.inject.Inject

class AmoledDisplay @Inject constructor() : Display {
    override fun turnOnScreen() {
        Log.i("TAGY", "amoled display is created")
    }
}