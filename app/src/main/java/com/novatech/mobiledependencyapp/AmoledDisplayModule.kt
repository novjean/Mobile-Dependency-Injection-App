package com.novatech.mobiledependencyapp

import dagger.Module
import dagger.Provides

@Module
class AmoledDisplayModule(var displayResolution : Int) {
    @Provides
    fun providesAmoledDisplay(amoledDisplay: AmoledDisplay) : Display{
        return amoledDisplay
    }
}