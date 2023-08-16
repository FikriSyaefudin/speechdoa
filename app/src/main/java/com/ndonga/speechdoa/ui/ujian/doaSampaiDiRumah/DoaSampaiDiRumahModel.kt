package com.ndonga.speechdoa.ui.ujian.doaSampaiDiRumah

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaSampaiDiRumahEntity
import com.ndonga.speechdoa.utils.data

class DoaSampaiDiRumahModel : ViewModel() {
    fun getDoaSampaiDiRumah(): List<DoaSampaiDiRumahEntity> = data.generateDoaSampaiDiRumah()
}