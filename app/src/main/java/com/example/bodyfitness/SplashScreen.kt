package com.example.bodyfitness

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val time :Long = 1000

        Handler().postDelayed(Runnable{
            val intent = Intent(SplashScreen@this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        },time)
        }

}


