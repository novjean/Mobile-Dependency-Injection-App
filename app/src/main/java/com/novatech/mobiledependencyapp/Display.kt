package com.novatech.mobiledependencyapp

import android.util.Log
import javax.inject.Inject

class Display @Inject constructor() {
    init {
        Log.i("TAGY", "screen created")
    }
    fun turnOnScreen(){
        Log.i("TAGY", "turning on the screen")
    }
}