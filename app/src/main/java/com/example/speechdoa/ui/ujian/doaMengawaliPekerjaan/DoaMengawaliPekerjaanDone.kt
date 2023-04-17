package com.example.speechdoa.ui.ujian.doaMengawaliPekerjaan

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaMengawaliPekerjaanDoneBinding
import com.example.speechdoa.ui.ujian.doaMengawaliPekerjaan.DoaMengawaliPekerjaanDone

class DoaMengawaliPekerjaanDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaMengawaliPekerjaanDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaMengawaliPekerjaanDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(DoaMengawaliPekerjaanDone.HASIL)
        val soal = intent.getStringExtra(DoaMengawaliPekerjaanDone.SOAL)
        val jawaban = intent.getStringExtra(DoaMengawaliPekerjaanDone.JAWABAN)



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