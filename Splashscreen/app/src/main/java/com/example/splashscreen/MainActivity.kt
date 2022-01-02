package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.window.SplashScreenView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import java.lang.reflect.Modifier
import org.w3c.dom.Text as Text1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        installSplashScreen().apply {
            this.setKeepVisibleCondition()
        }

        setContentView{
            SplashScreenView{
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Layout.Alignment.ALIGN_CENTER
                ){
                    Text1(text = "HELLO WORLD")
                }
            }
        }
    }


}