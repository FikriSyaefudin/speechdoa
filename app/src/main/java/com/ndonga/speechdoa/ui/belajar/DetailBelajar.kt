package com.ndonga.speechdoa.ui.belajar

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ndonga.speechdoa.R
import com.ndonga.speechdoa.api.api
import com.ndonga.speechdoa.api.url
import org.json.JSONArray

class DetailBelajar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_belajar)
        val fullURL = url + "/" + api
        println(fullURL)
        var isi = intent.getStringExtra("isi").toString()
        var nama = intent.getStringExtra("nama").toString()
        val list_isi = JSONArray(isi)
        val lastindex= list_isi?.length()!! -1
        val doa = findViewById<TextView>(R.id.list_doa)
        println(lastindex)
        var rawtext = ""
        for (i in 0..lastindex) {
            println(list_isi[i].toString())
            var text = list_isi[i].toString()+"\n"
            val hasilbagi = (i+1) % 4
            if (hasilbagi == 0){
                text = list_isi[i].toString()+"\n\n"
            }
            rawtext += text
        }
        doa.text = rawtext
        val judul = findViewById<TextView>(R.id.judul)
        judul.text = nama
        val button_back = findViewById<ImageView>(R.id.btn_back)
        button_back.setOnClickListener{
            val intent = Intent(this, Belajar::class.java)
            startActivity(intent)
        }
    }
}