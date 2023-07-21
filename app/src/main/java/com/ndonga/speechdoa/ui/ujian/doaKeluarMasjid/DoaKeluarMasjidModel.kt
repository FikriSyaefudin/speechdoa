package com.ndonga.speechdoa.ui.ujian.doaKeluarMasjid

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaKeluarMasjidEntity
import com.ndonga.speechdoa.utils.data

class DoaKeluarMasjidModel : ViewModel() {
    fun getDoaKeluarMasjid(): List<DoaKeluarMasjidEntity> = data.generateDoaKeluarMasjid()
}