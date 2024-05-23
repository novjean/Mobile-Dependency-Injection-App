package com.novatech.mobiledependencyapp

import dagger.Module
import dagger.Provides

@Module
class BatteryModule {

    @Provides
    fun providesBattery() : Battery {
        return Battery()
    }
}