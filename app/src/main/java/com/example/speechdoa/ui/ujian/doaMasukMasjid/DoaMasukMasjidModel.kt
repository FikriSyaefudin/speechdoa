package com.example.speechdoa.ui.ujian.doaMasukMasjid

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaMasukMasjidEntity
import com.example.speechdoa.utils.data

class DoaMasukMasjidModel : ViewModel() {
    fun getDoaMasukMasjid(): List<DoaMasukMasjidEntity> = data.generateDoaMasukMasjid()
}