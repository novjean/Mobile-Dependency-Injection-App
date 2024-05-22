package com.novatech.mobiledependencyapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val battery = Battery()
//        val display = Display()
//        val serviceProvider = ServiceProvider()
//        val simCard = SimCard(serviceProvider)

//        val serviceProvider = ServiceProvider()
//        val simCard = SimCard()
//        simCard.serviceProvider = ServiceProvider()
////        simCard.setServiceProvider(serviceProvider)
//
//        val mobile = Mobile(Battery(), simCard, Display())
//        mobile.turnOnMobile()



    }
}