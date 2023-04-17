package com.example.speechdoa.ui.ujian.doaMengakhiriPekerjaan

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaKeluarKamarMandiEntity
import com.example.speechdoa.data.DoaMauMakanEntity
import com.example.speechdoa.data.DoaMengakhiriPekerjaanEntity
import com.example.speechdoa.utils.data

class DoaMengakhiriPekerjaanModel : ViewModel() {
    fun getDoaMengakhiriPekerjaan(): List<DoaMengakhiriPekerjaanEntity> = data.generateDoaMengakhiriPekerjaan()
}