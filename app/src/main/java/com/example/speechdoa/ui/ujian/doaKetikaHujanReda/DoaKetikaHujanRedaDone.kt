package com.example.speechdoa.ui.ujian.doaKetikaHujanReda

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaKetikaHujanRedaDoneBinding
import com.example.speechdoa.ui.ujian.doaKetikaHujanReda.DoaKetikaHujanRedaDone

class DoaKetikaHujanRedaDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaKetikaHujanRedaDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaKetikaHujanRedaDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(DoaKetikaHujanRedaDone.HASIL)
        val soal = intent.getStringExtra(DoaKetikaHujanRedaDone.SOAL)
        val jawaban = intent.getStringExtra(DoaKetikaHujanRedaDone.JAWABAN)



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