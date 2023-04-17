package com.example.speechdoa.ui.ujian.doaTidur

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.speechdoa.R
import com.example.speechdoa.databinding.ActivityDoaTidurDoneBinding
import com.example.speechdoa.ui.ujian.doaTidur.doaTidurDone

class doaTidurDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaTidurDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaTidurDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hasil = intent.getStringExtra(doaTidurDone.HASIL)
        var soal = intent.getStringExtra(doaTidurDone.SOAL)
        var jawaban = intent.getStringExtra(doaTidurDone.JAWABAN)

        var soalarr= soal?.split(" ")
        var jwbarr=jawaban?.split(" ")
        println(soalarr)
        println(jwbarr)
        var jmlstr = 0
        var jmlslh = 0
        var hasil_hafalan=""
        if (soalarr != null) {
            for (i in soalarr){
                jmlstr = jmlstr+1
            }
        }
        println(jmlstr)
        if (jawaban != null) {
            for (i in jawaban){
                print(i)
            }
        }
        println(jmlstr)
        if (jwbarr != null) {
            for (j in jwbarr){
                if (soalarr != null) {
                    for (i in soalarr){
                        if (j == i){
                            var word = "<font color=#FF641A>"+i+"</font>"
                            jmlslh = jmlslh+1
                            hasil_hafalan = hasil_hafalan+word
                        } else{
                            var word = "<font color=#2aad46>"+i+"</font>"
                            hasil_hafalan = hasil_hafalan+word
                        }

                    }
                }

            }
        }

        val jmlbnr = jmlstr - jmlslh
        val score = jmlbnr * (100 / jmlstr)
        binding.hasil.text = hasil.toString()
        binding.soal.text =  Html.fromHtml(hasil_hafalan)
        binding.jawaban.text = "score : \n"+score+"%"

        if (binding.hasil.text == "Salah"){
            binding.jawaban.setTextColor(Color.parseColor("#FF0000"))
        }


        binding.btnSelesai.setOnClickListener {
            finish()
        }
    }
}