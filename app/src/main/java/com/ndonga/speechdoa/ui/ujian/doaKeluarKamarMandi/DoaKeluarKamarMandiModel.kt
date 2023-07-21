package com.ndonga.speechdoa.ui.ujian.doaKeluarKamarMandi

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaKeluarKamarMandiEntity
import com.ndonga.speechdoa.utils.data

class DoaKeluarKamarMandiModel : ViewModel() {
    fun getDoaKeluarKamarMandi(): List<DoaKeluarKamarMandiEntity> = data.generateDoaKeluarKamarMandi()
}