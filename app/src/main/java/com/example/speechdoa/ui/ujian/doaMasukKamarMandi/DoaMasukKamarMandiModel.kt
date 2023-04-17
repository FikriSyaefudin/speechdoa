package com.example.speechdoa.ui.ujian.doaMasukKamarMandi

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaKeluarKamarMandiEntity
import com.example.speechdoa.data.DoaMasukKamarMandiEntity
import com.example.speechdoa.data.DoaMauMakanEntity
import com.example.speechdoa.utils.data

class DoaMasukKamarMandiModel : ViewModel() {
    fun getDoaMasukKamarMandi(): List<DoaMasukKamarMandiEntity> = data.generateDoaMasukKamarMandi()
}