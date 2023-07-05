package com.example.speechdoa.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.speechdoa.R
import com.example.speechdoa.base.BaseActivity
import com.example.speechdoa.databinding.ActivityMainBinding
import com.example.speechdoa.ui.about.About
import com.example.speechdoa.ui.ujian.Ujian
import com.example.speechdoa.ui.belajar.Belajar

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