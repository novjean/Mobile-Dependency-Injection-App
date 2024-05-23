package com.novatech.mobiledependencyapp

import dagger.Component

@Component(modules = [BatteryModule::class, AmoledDisplayModule::class])
interface MobileComponent {

    fun getMobileInstance() : Mobile

}