package com.ndonga.speechdoa.ui.main

import android.content.Intent
import android.os.Bundle
import com.ndonga.speechdoa.base.BaseActivity
import com.ndonga.speechdoa.databinding.ActivityMainBinding
import com.ndonga.speechdoa.ui.about.About
import com.ndonga.speechdoa.ui.ujian.Ujian
import com.ndonga.speechdoa.ui.belajar.Belajar
import com.ndonga.speechdoa.ui.praktik.Praktik

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBelajar.setOnClickListener {
            val intent = Intent(Intent(applicationContext, Belajar::class.java))
            startActivity(intent)
        }

        binding.btnHafalan.setOnClickListener {
            val intent = Intent(Intent(applicationContext, Ujian::class.java))
            startActivity(intent)
        }
        binding.btnAbout.setOnClickListener {
            val intent = Intent(Intent(applicationContext, About::class.java))
            startActivity(intent)
        }

    }
}