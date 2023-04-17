package com.example.speechdoa.ui.ujian.doaMauMakan

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.databinding.ActivityDoaMauMakanDoneBinding


class DoaMauMakanDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaMauMakanDoneBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_doa_tidur_done)
        binding = ActivityDoaMauMakanDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(HASIL)
        val soal = intent.getStringExtra(SOAL)
        val jawaban = intent.getStringExtra(JAWABAN)



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