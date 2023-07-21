package com.ndonga.speechdoa.ui.ujian.doaMelihatKilat

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMelihatKilatEntity
import com.ndonga.speechdoa.utils.data

class DoaMelihatKilatModel: ViewModel(){
    fun getDoaMelihatKilat(): List<DoaMelihatKilatEntity> = data.generateDoamelihatkilat()
}