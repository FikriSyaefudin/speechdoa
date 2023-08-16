package com.ndonga.speechdoa.ui.ujian.doaKeluarRumah

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaKeluarRumahEntity
import com.ndonga.speechdoa.utils.data

class DoaKeluarRumahModel : ViewModel() {
    fun getDoaKeluarRumah(): List<DoaKeluarRumahEntity> = data.generateDoaKeluarRumah()
}