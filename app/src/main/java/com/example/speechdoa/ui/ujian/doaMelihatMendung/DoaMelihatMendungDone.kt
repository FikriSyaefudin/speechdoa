package com.example.speechdoa.ui.ujian.doaMelihatMendung

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaMelihatMendungDoneBinding
import com.example.speechdoa.ui.ujian.doaMelihatMendung.DoaMelihatMendungDone

class DoaMelihatMendungDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaMelihatMendungDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaMelihatMendungDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(DoaMelihatMendungDone.HASIL)
        val soal = intent.getStringExtra(DoaMelihatMendungDone.SOAL)
        val jawaban = intent.getStringExtra(DoaMelihatMendungDone.JAWABAN)



        binding.hasil.text = hasil.toString()
        binding.soal.text = soal.toString()
        binding.jawaban.text = jawaban.toString()

        if (binding.hasil.text == "Salah"){
            binding.jawaban.setTextColor(Color.parseColor("#FF0000"))
        }


        binding.btnSelesai.setOnClickListener {
            finish()
        }
    }
}