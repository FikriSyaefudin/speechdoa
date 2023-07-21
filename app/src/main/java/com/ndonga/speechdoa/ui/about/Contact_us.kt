package com.ndonga.speechdoa.ui.about

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.ndonga.speechdoa.base.BaseActivity
import com.ndonga.speechdoa.databinding.ActivityAboutContactUsBinding

class Contact_us : BaseActivity() {
    private lateinit var binding: ActivityAboutContactUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutContactUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = "fikrisaefudin3@gmail.com"

        binding.btncopy.setOnClickListener {
            Toast.makeText(baseContext, "text copied to clipboard", Toast.LENGTH_SHORT).show()
            var  clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            var clip =  ClipData.newPlainText("sukses",email);
            clipboard.setPrimaryClip(clip);
        }
        binding.btnBack.setOnClickListener {
            val intent = Intent(Intent(applicationContext, About::class.java))
            startActivity(intent)
        }
    }
}