package com.ndonga.speechdoa.ui.belajar

import android.content.Intent
import android.os.Bundle
import com.ndonga.speechdoa.base.BaseActivity
import com.ndonga.speechdoa.databinding.ActivityBelajarBinding
import com.ndonga.speechdoa.ui.main.MainActivity

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