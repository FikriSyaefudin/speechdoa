package com.ndonga.speechdoa.ui.ujian.doaMasukRumah

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMasukRumahEntity
import com.ndonga.speechdoa.utils.data

class DoaMasukRumahModel : ViewModel() {
    fun getDoaMasukRumah(): List<DoaMasukRumahEntity> = data.generateDoaMasukRumah()
}