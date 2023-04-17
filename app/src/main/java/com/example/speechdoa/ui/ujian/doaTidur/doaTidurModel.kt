package com.example.speechdoa.ui.ujian.doaTidur

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaTidurEntity
import com.example.speechdoa.utils.data

class doaTidurModel: ViewModel(){
    fun getDoaTidur(): List<DoaTidurEntity> = data.generateDoaTidur()
}