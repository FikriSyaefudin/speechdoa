package com.ndonga.speechdoa.ui.ujian.doaBercermin

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaBercerminEntity
import com.ndonga.speechdoa.utils.data

class DoaBercerminModel : ViewModel() {
    fun getDoaBercermin(): List<DoaBercerminEntity> = data.generateDoaBercermin()
}