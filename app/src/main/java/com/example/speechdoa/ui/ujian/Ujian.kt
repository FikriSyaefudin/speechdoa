package com.example.speechdoa.ui.ujian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.speechdoa.R
import com.example.speechdoa.ui.main.MainActivity
import com.example.speechdoa.ui.ujian.doaMauMakan.DoaMauMakanStart
import com.example.speechdoa.ui.ujian.doaSesudahMakan.DoaSesudahMakanStart
import com.example.speechdoa.ui.ujian.doaSesudahTidur.DoaSesudahTidurStart
import com.example.speechdoa.ui.ujian.doaTidur.doaTidurStart
import com.example.speechdoa.ui.ujian.doaMasukMasjid.DoaMasukMasjidStart
import com.example.speechdoa.ui.ujian.doaKeluarMasjid.DoaKeluarMasjidStart
import com.example.speechdoa.ui.ujian.doaKetikaHujanLebat.DoaKetikaHujanLebatStart
import com.example.speechdoa.ui.ujian.doaKetikaHujanReda.doaKetikaHujanRedaStart
import com.example.speechdoa.ui.ujian.doaMelihatKilat.DoaMelihatKilatStart
import com.example.speechdoa.ui.ujian.doaMelihatMendung.DoaMelihatMendungStart
import com.example.speechdoa.ui.ujian.doaMengakhiriPekerjaan.DoaMengakhiriPekerjaanStart
import com.example.speechdoa.ui.ujian.doaMengawaliPekerjaan.DoaMengawaliPekerjaanStart
import com.example.speechdoa.ui.ujian.doaTurunHujan.doaTurunHujanStart

class Ujian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ujian)

        val button_doa_tidur = findViewById<Button>(R.id.btn_doa_tidur)
        button_doa_tidur.setOnClickListener{
            val intent = Intent(this, doaTidurStart::class.java)
            startActivity(intent)
        }

        val button_doa_sesudah_tidur = findViewById<Button>(R.id.btn_doa_sesudah_tidur)
        button_doa_sesudah_tidur.setOnClickListener{
            val intent = Intent(this, DoaSesudahTidurStart::class.java)
            startActivity(intent)
        }


        val button_doa_mau_makan = findViewById<Button>(R.id.btn_doa_mau_makan)
        button_doa_mau_makan.setOnClickListener{
            val intent = Intent(this, DoaMauMakanStart::class.java)
            startActivity(intent)
        }

        val button_doa_sesudah_makan = findViewById<Button>(R.id.btn_doa_sesudah_makan)
        button_doa_sesudah_makan.setOnClickListener{
            val intent = Intent(this, DoaSesudahMakanStart::class.java)
            startActivity(intent)
        }

        val button_doa_masuk_masjid = findViewById<Button>(R.id.btn_doa_masuk_masjid)
        button_doa_masuk_masjid.setOnClickListener{
            val intent = Intent(this, DoaMasukMasjidStart::class.java)
            startActivity(intent)
        }

        val button_doa_keluar_masjid = findViewById<Button>(R.id.btn_doa_keluar_masjid)
        button_doa_keluar_masjid.setOnClickListener {
            val intent = Intent(this, DoaKeluarMasjidStart::class.java)
            startActivity(intent)
        }

        val button_doa_mengawali_pekerjaan = findViewById<Button>(R.id.btn_doa_mengawali_pekerjaan)
        button_doa_mengawali_pekerjaan.setOnClickListener {
            val intent = Intent(this, DoaMengawaliPekerjaanStart::class.java)
            startActivity(intent)
        }

        val button_doa_mengakhiri_pekerjaan = findViewById<Button>(R.id.btn_doa_mengakhiri_pekerjaan)
        button_doa_mengakhiri_pekerjaan.setOnClickListener {
            val intent = Intent(this, DoaMengakhiriPekerjaanStart::class.java)
            startActivity(intent)
        }

        val button_doa_melihat_mendung = findViewById<Button>(R.id.btn_doa_melihat_mendung)
        button_doa_melihat_mendung.setOnClickListener {
            val intent = Intent(this, DoaMelihatMendungStart::class.java)
            startActivity(intent)
        }

        val button_doa_melihat_kilat = findViewById<Button>(R.id.btn_doa_melihat_kilat)
        button_doa_melihat_kilat.setOnClickListener {
            val intent = Intent(this, DoaMelihatKilatStart::class.java)
            startActivity(intent)
        }

        val button_doa_turun_hujan = findViewById<Button>(R.id.btn_doa_turun_hujan)
        button_doa_turun_hujan.setOnClickListener {
            val intent = Intent(this, doaTurunHujanStart::class.java)
            startActivity(intent)
        }

        val button_doa_ketika_hujan_lebat = findViewById<Button>(R.id.btn_doa_ketika_hujan_lebat)
        button_doa_ketika_hujan_lebat.setOnClickListener {
            val intent = Intent(this, DoaKetikaHujanLebatStart::class.java)
            startActivity(intent)
        }

        val button_doa_ketika_hujan_reda = findViewById<Button>(R.id.btn_doa_ketika_hujan_reda)
        button_doa_ketika_hujan_reda.setOnClickListener {
            val intent = Intent(this, doaKetikaHujanRedaStart::class.java)
            startActivity(intent)
        }

        val button_back = findViewById<ImageView>(R.id.btn_back)
        button_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}