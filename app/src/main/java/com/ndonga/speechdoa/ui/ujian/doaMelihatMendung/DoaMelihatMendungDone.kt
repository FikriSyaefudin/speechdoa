package com.ndonga.speechdoa.ui.ujian.doaMelihatMendung

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.ndonga.speechdoa.databinding.ActivityDoaMelihatMendungDoneBinding
import com.ndonga.speechdoa.ui.ujian.doaTidur.doaTidurDone

class DoaMelihatMendungDone : AppCompatActivity() {
    companion object{
        const val HASIL = "hasil"
        const val JAWABAN = "jawaban"
        const val SOAL = "soal"

    }

    private lateinit var binding: ActivityDoaMelihatMendungDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaMelihatMendungDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var hasil = ""
        var soal = intent.getStringExtra(doaTidurDone.SOAL)
        var jawaban = intent.getStringExtra(doaTidurDone.JAWABAN)
        var soalarr = soal!!.split(" ")
        var jwbarr = jawaban!!.split(" ")
        println(soalarr)
        println(jwbarr)
        var jmlbnr = 0
        var hasil_hafalan = ""

        var jmlstr = soal?.length ?: 0
        var jmljwb = jawaban?.length ?: 0
        println(jmlstr)
        println(jmljwb)

        var word = ""
        var letter =""
        //cek apakah pasti benar
        if (soal == jawaban){
            jmlbnr=jmlstr
            word = "<font color=#2aad46> $jawaban </font>"
            hasil_hafalan += "$word "
        }
        else {
            // cek kata
            soalarr.forEachIndexed { indexkata, kata ->
                if (indexkata <= jwbarr.size - 1) {
                    if (jwbarr[indexkata] == soalarr[indexkata]) {
                        println("1 kata jawaban $kata index $indexkata ketemu di kata soal $kata index $indexkata ")
                        word = "<font color=#2aad46> $kata </font>"
                        hasil_hafalan += "$word "
                        for (bnr in kata) jmlbnr++

                    } else {
                        println("2 kata jawaban " + jwbarr[indexkata] + " index $indexkata tidak ketemu di kata soal $kata index $indexkata ")

                        val jwbhrf = jwbarr[indexkata].toList()
                        val soalhrf = soalarr[indexkata].toList()

                        word = ""
                        // cek huruf
                        soalhrf.forEachIndexed { indexhrf, hrf ->
                            if (indexhrf <= jwbhrf.size - 1) {
                                if (jwbhrf[indexhrf] == soalhrf[indexhrf]) {
                                    println("1 huruf jawaban $hrf index $indexhrf ketemu di kata soal $hrf index $indexhrf ")
                                    letter =
                                        "<font color=#2aad46>" + hrf + "</font>"
                                    word += "$letter"
                                    jmlbnr++

                                } else {
                                    println("2 huruf jawaban " + jwbhrf[indexhrf] + " index $indexhrf tidak ketemu di kata soal $hrf index $indexhrf ")
                                    letter = "<font color=#FF641A>" + hrf + "</font>"
                                    word += "$letter"
                                }
                            } else {
                                println("3 huruf jawaban tidak ada index tidak ada maka tidak ketemu di kata soal $hrf index $indexhrf ")
                                letter = "<font color=#FF641A>" + hrf + "</font>"
                                word += "$letter"
                            }

                        }
                        // end cek huruf
                        hasil_hafalan += "$word "
                    }
                } else {
                    println("3 huruf jawaban tidak ada index tidak ada maka tidak ketemu di kata soal $kata index $indexkata ")
                    word = "<font color=#FF641A> $kata </font>"
                    hasil_hafalan += "$word "
                }

            }
        }
        // end cek kata
        println(hasil_hafalan)

        var score = 0
        val jmlslh = jmlstr - jmlbnr

        hasil = when {
            jmlbnr == 0 -> "Salah"
            jmlbnr == jmlstr -> "Benar"
            else -> "Salah"
        }
        println(hasil_hafalan)
        println(jmlbnr)
        println(jmlslh)
        if (hasil == "Salah") {
            var persentase = (jmlbnr.toDouble() / jmlstr.toDouble()) * 100.0
            score = persentase.toInt()
            binding.hasil.setTextColor(Color.parseColor("#FF0000"))
        } else {
            binding.hasil.setTextColor(Color.parseColor("#2aad46"))
            binding.jawaban.setTextColor(Color.parseColor("#2aad46"))
            score = 100
        }
        println(score)

        val scoretext = "Score : <br> ${if (score <= 50) "<font color=#FF0000>$score % </font>" else "<font color=#2aad46>$score % </font>"}"

        binding.hasil.text = hasil
        binding.soal.text = Html.fromHtml(hasil_hafalan)
        binding.jawaban.text = Html.fromHtml(scoretext)
        println(jmlbnr)
        println(hasil)
        println(score)
        binding.btnSelesai.setOnClickListener { finish() }
    }
}