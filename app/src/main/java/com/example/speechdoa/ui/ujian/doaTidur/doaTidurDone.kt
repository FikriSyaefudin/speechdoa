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
        var jwbarr = jawaban.split(" ")
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
        var filterjwbarr :List<String> = arrayListOf("")
        if (jwbarr != null) {
            var index = 1
            for (j in jwbarr) {
                if (soalarr != null) {
                    if (j in soalarr) {
                        println("keterangan kata " + j + " ada di doa mau tidur")

                    } else {
                        print(jwbarr.indexOf(j))
                        jwbarr = remove(jwbarr, jwbarr.indexOf(j))
                        println("keterangan kata " + j + " tidak ada di doa mau tidur")
                    }
                }
                index = index + 1
            }
        }
        var ketemu = 0
        println(jwbarr)
            if (jwbarr != null) {
                for (j in jwbarr){
                    if (soalarr != null) {
                        if(ketemu != 0 ) {
                            var index = 1
                            for (i in soalarr) {
                                println(i)
                                if (index > ketemu) {
                                    if (j == i) {
                                        var word = "<font color=#FF641A>" + i + "</font>"
                                        jmlslh = jmlslh + 1
                                        hasil_hafalan = hasil_hafalan + word + " "
                                        println(soalarr[index-1])
                                        println(i)
                                        println(index)
                                        println(jwbarr.last())
                                        println(soalarr.last())
                                        ketemu = index
                                        if (i == jwbarr.last()){

                                        }
                                        else {
                                            break
                                        }
                                    } else {
                                        var word = "<font color=#2aad46>" + i + "</font>"
                                        hasil_hafalan = hasil_hafalan + word + " "
                                    }
                                }
                                index = index + 1
                            }

                        }
                        else{
                            var index = 1
                            for (i in soalarr) {
                                if (j == i) {
                                    var word = "<font color=#FF641A>" + i + "</font>"
                                    jmlslh = jmlslh + 1
                                    hasil_hafalan = hasil_hafalan + word + " "
                                    println(soalarr[index])
                                    println(index)
                                    ketemu = index
                                    if (i == jwbarr.last()){

                                    }
                                    else {
                                        break
                                    }
                                } else {
                                    var word = "<font color=#2aad46>" + i + "</font>"
                                    hasil_hafalan = hasil_hafalan + word + " "
                                }
                                index = index + 1
                            }

                        }
                    }

                }
            }
            else{
                if (soalarr != null) {
                    for (i in soalarr) {
                        var word = "<font color=#2aad46>" + i + "</font>"
                        hasil_hafalan = hasil_hafalan + word + " "
                    }
                }
            }



        val jmlbnr = jmlstr - jmlslh
        var score = 0
        if (hasil == "Salah"){
            score = jmlbnr * (100 / jmlstr)
            binding.hasil.setTextColor(Color.parseColor("#FF0000"))
        }
        else {
            score = 100
        }
        binding.hasil.text = hasil.toString()
        binding.soal.text =  Html.fromHtml(hasil_hafalan)
        if (score<=50){
            var scoretext = "Score : <br> "+"<font color=#FF0000>" + score + " % </font>"
            binding.jawaban.text = Html.fromHtml(scoretext)
        }
        else{
            var scoretext = "Score : <br> "+"<font color=#2aad46>" + score + " % </font>"
            binding.jawaban.text = Html.fromHtml(scoretext)
        }
        binding.btnSelesai.setOnClickListener {
            finish()
        }
    }
    fun remove(arr: List<String>, index:Int):List<String>{
        if (index <0 || index >= arr.size){
            return arr
        }

        val result = arr.toMutableList()
        result.removeAt(index)
        return result.toList<String>()
    }
}
