package com.ndonga.speechdoa.ui.ujian.doaMengawaliPekerjaan

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMengawaliPekerjaanEntity
import com.ndonga.speechdoa.utils.data

class DoaMengawaliPekerjaanModel : ViewModel() {
    fun getDoaMengawaliPekerjaan(): List<DoaMengawaliPekerjaanEntity> = data.generateDoaMengawaliPekerjaan()
}