package com.example.speechdoa.ui.ujian.doaKetikaHujanReda

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaKetikaHujanRedaEntity
import com.example.speechdoa.utils.data

class DoaKetikaHujanRedaModel: ViewModel(){
    fun getDoaKetikaHujanReda(): List<DoaKetikaHujanRedaEntity> = data.generateDoaKetikaHujanReda()
}