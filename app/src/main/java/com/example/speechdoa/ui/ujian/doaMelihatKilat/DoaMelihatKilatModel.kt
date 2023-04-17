package com.example.speechdoa.ui.ujian.doaMelihatKilat

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaMelihatKilatEntity
import com.example.speechdoa.utils.data

class DoaMelihatKilatModel: ViewModel(){
    fun getDoaMelihatKilat(): List<DoaMelihatKilatEntity> = data.generateDoamelihatkilat()
}