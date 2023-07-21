package com.ndonga.speechdoa.ui.ujian.doaKetikaHujanReda

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaKetikaHujanRedaEntity
import com.ndonga.speechdoa.utils.data

class DoaKetikaHujanRedaModel: ViewModel(){
    fun getDoaKetikaHujanReda(): List<DoaKetikaHujanRedaEntity> = data.generateDoaKetikaHujanReda()
}