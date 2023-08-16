package com.ndonga.speechdoa.ui.ujian.doaNaikKendaraan

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaNaikKendaraanEntity
import com.ndonga.speechdoa.utils.data

class DoaNaikKendaraanModel : ViewModel() {
    fun getDoaNaikKendaraan(): List<DoaNaikKendaraanEntity> = data.generateDoaNaikKendaraan()
}