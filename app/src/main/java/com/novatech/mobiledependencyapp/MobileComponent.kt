package com.novatech.mobiledependencyapp

import dagger.Component

@Component(modules = [BatteryModule::class])
interface MobileComponent {

    fun getMobileInstance() : Mobile

}