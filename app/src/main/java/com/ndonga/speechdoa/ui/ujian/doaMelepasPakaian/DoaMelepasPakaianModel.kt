package com.ndonga.speechdoa.ui.ujian.doaMelepasPakaian

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMelepasPakaianEntity
import com.ndonga.speechdoa.utils.data

class DoaMelepasPakaianModel : ViewModel() {
    fun getDoaMelepasPakaian(): List<DoaMelepasPakaianEntity> = data.generateDoaMelepasPakaian()
}