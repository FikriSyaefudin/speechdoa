package com.example.speechdoa.ui.about

import android.content.Intent
import android.os.Bundle
import com.example.speechdoa.base.BaseActivity
import com.example.speechdoa.databinding.ActivityAboutInfoBinding
import com.example.speechdoa.ui.main.MainActivity

class Info : BaseActivity() {
    private lateinit var binding: ActivityAboutInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            val intent = Intent(Intent(applicationContext, About::class.java))
            startActivity(intent)
        }
    }
}