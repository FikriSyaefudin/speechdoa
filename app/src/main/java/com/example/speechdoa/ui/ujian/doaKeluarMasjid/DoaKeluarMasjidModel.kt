package com.example.speechdoa.ui.ujian.doaKeluarMasjid

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaKeluarMasjidEntity
import com.example.speechdoa.utils.data

class DoaKeluarMasjidModel : ViewModel() {
    fun getDoaKeluarMasjid(): List<DoaKeluarMasjidEntity> = data.generateDoaKeluarMasjid()
}