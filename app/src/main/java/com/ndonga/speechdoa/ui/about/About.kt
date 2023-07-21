package com.ndonga.speechdoa.ui.about

import android.content.Intent
import android.os.Bundle
import com.ndonga.speechdoa.base.BaseActivity
import com.ndonga.speechdoa.databinding.ActivityAboutBinding
import com.ndonga.speechdoa.ui.main.MainActivity

class About : BaseActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKontak.setOnClickListener{
            val intent = Intent(Intent(applicationContext, Contact_us::class.java))
            startActivity(intent)
        }
        binding.btnInfo.setOnClickListener {
            val intent = Intent(Intent(applicationContext, Info::class.java))
            startActivity(intent)
        }
        binding.btnBack.setOnClickListener {
            val intent = Intent(Intent(applicationContext, MainActivity::class.java))
            startActivity(intent)
        }
    }
}