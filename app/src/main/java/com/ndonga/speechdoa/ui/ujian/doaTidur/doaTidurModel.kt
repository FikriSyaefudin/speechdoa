package com.ndonga.speechdoa.ui.ujian.doaTidur

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaTidurEntity
import com.ndonga.speechdoa.utils.data

class doaTidurModel: ViewModel(){
    fun getDoaTidur(): List<DoaTidurEntity> = data.generateDoaTidur()
}