package com.ndonga.speechdoa.ui.ujian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.ndonga.speechdoa.R
import com.ndonga.speechdoa.ui.main.MainActivity
import com.ndonga.speechdoa.ui.ujian.doaBercermin.DoaBercerminStart
import com.ndonga.speechdoa.ui.ujian.doaKeluarKamarMandi.DoaKeluarKamarMandiStart
import com.ndonga.speechdoa.ui.ujian.doaMauMakan.DoaMauMakanStart
import com.ndonga.speechdoa.ui.ujian.doaSesudahMakan.DoaSesudahMakanStart
import com.ndonga.speechdoa.ui.ujian.doaSesudahTidur.DoaSesudahTidurStart
import com.ndonga.speechdoa.ui.ujian.doaTidur.doaTidurStart
import com.ndonga.speechdoa.ui.ujian.doaMasukMasjid.DoaMasukMasjidStart
import com.ndonga.speechdoa.ui.ujian.doaKeluarMasjid.DoaKeluarMasjidStart
import com.ndonga.speechdoa.ui.ujian.doaKeluarRumah.DoaKeluarRumahStart
import com.ndonga.speechdoa.ui.ujian.doaKetikaHujanLebat.DoaKetikaHujanLebatStart
import com.ndonga.speechdoa.ui.ujian.doaKetikaHujanReda.DoaKetikaHujanRedaStart
import com.ndonga.speechdoa.ui.ujian.doaMasukKamarMandi.DoaMasukKamarmandiStart
import com.ndonga.speechdoa.ui.ujian.doaMasukRumah.DoaMasukRumahStart
import com.ndonga.speechdoa.ui.ujian.doaMauBepergian.DoaMauBepergianStart
import com.ndonga.speechdoa.ui.ujian.doaMauMandi.DoaMauMandiStart
import com.ndonga.speechdoa.ui.ujian.doaMelepasPakaian.DoaMelepasPakaianStart
import com.ndonga.speechdoa.ui.ujian.doaMelihatKilat.DoaMelihatKilatStart
import com.ndonga.speechdoa.ui.ujian.doaMelihatMendung.DoaMelihatMendungStart
import com.ndonga.speechdoa.ui.ujian.doaMemakaiPakaian.DoaMemakaiPakaianStart
import com.ndonga.speechdoa.ui.ujian.doaMengakhiriPekerjaan.DoaMengakhiriPekerjaanStart
import com.ndonga.speechdoa.ui.ujian.doaMengawaliPekerjaan.DoaMengawaliPekerjaanStart
import com.ndonga.speechdoa.ui.ujian.doaNaikKendaraan.DoaNaikKendaraanStart
import com.ndonga.speechdoa.ui.ujian.doaSampaiDiRumah.DoaSampaiDiRumahStart
import com.ndonga.speechdoa.ui.ujian.doaTurunHujan.doaTurunHujanStart

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
            val intent = Intent(this, DoaKetikaHujanRedaStart::class.java)
            startActivity(intent)
        }
        val button_doa_memakai_pakaian = findViewById<Button>(R.id.btn_doa_memakai_pakaian)
        button_doa_memakai_pakaian.setOnClickListener {
            val intent = Intent(this, DoaMemakaiPakaianStart::class.java)
            startActivity(intent)
        }
        val button_doa_melepas_pakaian = findViewById<Button>(R.id.btn_doa_melepas_pakaian)
        button_doa_melepas_pakaian.setOnClickListener {
            val intent = Intent(this, DoaMelepasPakaianStart::class.java)
            startActivity(intent)
        }
        val button_doa_bercermin = findViewById<Button>(R.id.btn_doa_bercermin)
        button_doa_bercermin.setOnClickListener {
            val intent = Intent(this, DoaBercerminStart::class.java)
            startActivity(intent)
        }
        val button_doa_mau_bepergian = findViewById<Button>(R.id.btn_doa_mau_bepergian)
        button_doa_mau_bepergian.setOnClickListener {
            val intent = Intent(this, DoaMauBepergianStart::class.java)
            startActivity(intent)
        }
        val button_doa_keluar_rumah = findViewById<Button>(R.id.btn_doa_keluar_rumah)
        button_doa_keluar_rumah.setOnClickListener {
            val intent = Intent(this, DoaKeluarRumahStart::class.java)
            startActivity(intent)
        }
        val button_doa_naik_kedaraan = findViewById<Button>(R.id.btn_doa_naik_kendaraan)
        button_doa_naik_kedaraan.setOnClickListener {
            val intent = Intent(this, DoaNaikKendaraanStart::class.java)
            startActivity(intent)
        }
        val button_doa_sampai_di_rumah = findViewById<Button>(R.id.btn_doa_sampai_di_rumah)
        button_doa_sampai_di_rumah.setOnClickListener {
            val intent = Intent(this, DoaSampaiDiRumahStart::class.java)
            startActivity(intent)
        }
        val button_doa_masuk_rumah = findViewById<Button>(R.id.btn_doa_masuk_rumah)
        button_doa_masuk_rumah.setOnClickListener {
            val intent = Intent(this, DoaMasukRumahStart::class.java)
            startActivity(intent)
        }
        val button_doa_masuk_kamar_mandi = findViewById<Button>(R.id.btn_doa_masuk_kamar_mandi)
        button_doa_masuk_kamar_mandi.setOnClickListener {
            val intent = Intent(this, DoaMasukKamarmandiStart::class.java)
            startActivity(intent)
        }
        val button_doa_keluar_kamar_mandi = findViewById<Button>(R.id.btn_doa_keluar_kamar_mandi)
        button_doa_keluar_kamar_mandi.setOnClickListener {
            val intent = Intent(this, DoaKeluarKamarMandiStart::class.java)
            startActivity(intent)
        }
        val button_doa_mau_mandi = findViewById<Button>(R.id.btn_doa_mau_mandi)
        button_doa_mau_mandi.setOnClickListener {
            val intent = Intent(this, DoaMauMandiStart::class.java)
            startActivity(intent)
        }

        val button_back = findViewById<ImageView>(R.id.btn_back)
        button_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}