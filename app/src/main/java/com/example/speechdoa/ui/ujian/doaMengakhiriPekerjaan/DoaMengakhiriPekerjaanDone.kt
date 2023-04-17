package com.example.speechdoa.ui.ujian.doaMengakhiriPekerjaan

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaMengakhiriPekerjaanDoneBinding
import com.example.speechdoa.ui.ujian.doaMengakhiriPekerjaan.DoaMengakhiriPekerjaanDone

class DoaMengakhiriPekerjaanDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaMengakhiriPekerjaanDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaMengakhiriPekerjaanDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(DoaMengakhiriPekerjaanDone.HASIL)
        val soal = intent.getStringExtra(DoaMengakhiriPekerjaanDone.SOAL)
        val jawaban = intent.getStringExtra(DoaMengakhiriPekerjaanDone.JAWABAN)



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