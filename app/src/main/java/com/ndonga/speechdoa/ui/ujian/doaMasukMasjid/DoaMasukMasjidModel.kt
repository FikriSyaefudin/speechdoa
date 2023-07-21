package com.ndonga.speechdoa.ui.ujian.doaMasukMasjid

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMasukMasjidEntity
import com.ndonga.speechdoa.utils.data

class DoaMasukMasjidModel : ViewModel() {
    fun getDoaMasukMasjid(): List<DoaMasukMasjidEntity> = data.generateDoaMasukMasjid()
}