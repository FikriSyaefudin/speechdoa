package com.example.speechdoa.ui.ujian.doaTurunHujan

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaTurunHujanDoneBinding
import com.example.speechdoa.ui.ujian.doaTurunHujan.doaTurunHujanDone

class doaTurunHujanDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaTurunHujanDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaTurunHujanDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(doaTurunHujanDone.HASIL)
        val soal = intent.getStringExtra(doaTurunHujanDone.SOAL)
        val jawaban = intent.getStringExtra(doaTurunHujanDone.JAWABAN)



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