package com.example.speechdoa.ui.ujian.doaKetikaHujanLebat

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaKetikaHujanLebatEntity
import com.example.speechdoa.utils.data

class DoaKetikaHujanLebatModel: ViewModel(){
    fun getDoaKetikaHujanLebat(): List<DoaKetikaHujanLebatEntity> = data.generateDoaKetikaHujanLebat()
}