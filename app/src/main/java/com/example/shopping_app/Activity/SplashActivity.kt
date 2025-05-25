package com.example.shopping_app.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.shopping_app.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var bingindig: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bingindig=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(bingindig.root)

        bingindig.startBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}