package com.example.speechdoa.ui.ujian.doaSesudahTidur

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaSesudahTidurEntity
import com.example.speechdoa.utils.data

class DoaSesudahTidurModel : ViewModel() {
    fun getDoaSesudahTidur(): List<DoaSesudahTidurEntity> = data.generateDoaSesudahTidur()
}