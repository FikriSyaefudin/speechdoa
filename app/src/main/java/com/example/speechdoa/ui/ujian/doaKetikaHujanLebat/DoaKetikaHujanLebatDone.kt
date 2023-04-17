package com.example.speechdoa.ui.ujian.doaKetikaHujanLebat

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaKetikaHujanLebatDoneBinding
import com.example.speechdoa.ui.ujian.doaKetikaHujanLebat.DoaKetikaHujanLebatDone

class DoaKetikaHujanLebatDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaKetikaHujanLebatDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaKetikaHujanLebatDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(DoaKetikaHujanLebatDone.HASIL)
        val soal = intent.getStringExtra(DoaKetikaHujanLebatDone.SOAL)
        val jawaban = intent.getStringExtra(DoaKetikaHujanLebatDone.JAWABAN)



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