package com.example.speechdoa.ui.ujian.doaKeluarKamarMandi

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaKeluarKamarMandiEntity
import com.example.speechdoa.data.DoaMauMakanEntity
import com.example.speechdoa.utils.data

class DoaKeluarKamarMandiModel : ViewModel() {
    fun getDoaKeluarKamarMandi(): List<DoaKeluarKamarMandiEntity> = data.generateDoaKeluarKamarMandi()
}