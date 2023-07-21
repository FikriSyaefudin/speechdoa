package com.ndonga.speechdoa.ui.ujian.doaKetikaHujanLebat

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaKetikaHujanLebatEntity
import com.ndonga.speechdoa.utils.data

class DoaKetikaHujanLebatModel: ViewModel(){
    fun getDoaKetikaHujanLebat(): List<DoaKetikaHujanLebatEntity> = data.generateDoaKetikaHujanLebat()
}