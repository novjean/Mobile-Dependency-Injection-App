package com.novatech.mobiledependencyapp

import dagger.Module
import dagger.Provides

// this is a custom module since a the resolution needs to be specified
@Module
class AmoledDisplayModule(var displayResolution : Int) {
    @Provides
    fun providesAmoledDisplay(amoledDisplay: AmoledDisplay) : Display{
        return amoledDisplay
    }
}