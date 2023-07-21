package com.ndonga.speechdoa.ui.about

import android.content.Intent
import android.os.Bundle
import com.ndonga.speechdoa.base.BaseActivity
import com.ndonga.speechdoa.databinding.ActivityAboutInfoBinding

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