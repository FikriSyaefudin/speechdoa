package com.ndonga.speechdoa.ui.ujian.doaMengakhiriPekerjaan

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMengakhiriPekerjaanEntity
import com.ndonga.speechdoa.utils.data

class DoaMengakhiriPekerjaanModel : ViewModel() {
    fun getDoaMengakhiriPekerjaan(): List<DoaMengakhiriPekerjaanEntity> = data.generateDoaMengakhiriPekerjaan()
}