package com.ndonga.speechdoa.ui.ujian.doaSesudahTidur

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaSesudahTidurEntity
import com.ndonga.speechdoa.utils.data

class DoaSesudahTidurModel : ViewModel() {
    fun getDoaSesudahTidur(): List<DoaSesudahTidurEntity> = data.generateDoaSesudahTidur()
}