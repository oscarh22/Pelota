package com.example.pelota

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {





        override fun onCreate(savedInstanceState: Bundle?) {
            var dibujo: Mipelota = Mipelota()
        super.onCreate(savedInstanceState)
            setContentView(dibujo)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        }

    private fun setContentView(dibujo: MainActivity.Mipelota) {

    }

    class Mipelota  {

    var alto = ""
    var anchor
    var tam
    var borderJustification = "12"


        Mipelota (){

        }
    }
}