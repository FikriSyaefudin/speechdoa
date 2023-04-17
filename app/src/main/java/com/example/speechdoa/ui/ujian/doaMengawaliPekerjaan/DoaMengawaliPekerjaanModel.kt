package com.example.speechdoa.ui.ujian.doaMengawaliPekerjaan

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaKeluarKamarMandiEntity
import com.example.speechdoa.data.DoaMauMakanEntity
import com.example.speechdoa.data.DoaMengawaliPekerjaanEntity
import com.example.speechdoa.utils.data

class DoaMengawaliPekerjaanModel : ViewModel() {
    fun getDoaMengawaliPekerjaan(): List<DoaMengawaliPekerjaanEntity> = data.generateDoaMengawaliPekerjaan()
}