package com.example.speechdoa.ui.ujian.doaMelihatKilat

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaMelihatKilatDoneBinding
import com.example.speechdoa.ui.ujian.doaMelihatKilat.DoaMelihatKilatDone

class DoaMelihatKilatDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaMelihatKilatDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaMelihatKilatDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(DoaMelihatKilatDone.HASIL)
        val soal = intent.getStringExtra(DoaMelihatKilatDone.SOAL)
        val jawaban = intent.getStringExtra(DoaMelihatKilatDone.JAWABAN)



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