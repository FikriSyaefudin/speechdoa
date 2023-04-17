package com.example.speechdoa.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.speechdoa.R
import com.example.speechdoa.base.BaseActivity
import com.example.speechdoa.databinding.ActivityMainBinding
import com.example.speechdoa.databinding.ActivitySplashScreenBinding
import com.example.speechdoa.ui.main.MainActivity

class SplashScreen : BaseActivity(){
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handler().postDelayed({
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}