package com.novatech.mobiledependencyapp

import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
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

        //rebuild the app and the these classes get generated
//        DaggerMobileComponent.create().getMobileInstance().turnOnMobile()

        // simple creation
//        DaggerMobileComponent.create().inject(this)
//        mobile.turnOnMobile()

        // custom creation passing resolution value
//        DaggerMobileComponent.builder()
//            .amoledDisplayModule(AmoledDisplayModule(1920))
//            .build()
//            .inject(this)

        (application as MobileApplication).mobile.inject(this)

    }
}