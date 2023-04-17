package com.example.speechdoa.ui.ujian.doaSesudahTidur

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaMauMakanDoneBinding
import com.example.speechdoa.databinding.ActivityDoaSesudahTidurDoneBinding
import com.example.speechdoa.ui.ujian.doaMauMakan.DoaMauMakanDone

class DoaSesudahTidurDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaSesudahTidurDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaSesudahTidurDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(DoaMauMakanDone.HASIL)
        val soal = intent.getStringExtra(DoaMauMakanDone.SOAL)
        val jawaban = intent.getStringExtra(DoaMauMakanDone.JAWABAN)



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