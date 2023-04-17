package com.example.speechdoa.ui.belajar

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import com.example.speechdoa.R
import com.example.speechdoa.base.BaseActivity
import com.example.speechdoa.databinding.ActivityBelajarBinding
import com.example.speechdoa.databinding.ActivityMainBinding
import com.example.speechdoa.ui.main.MainActivity

class Belajar : BaseActivity() {
    private lateinit var binding: ActivityBelajarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBelajarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent = Intent(Intent(applicationContext, MainActivity::class.java))
            startActivity(intent)
        }
    }
}