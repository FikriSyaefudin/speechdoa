package com.ndonga.speechdoa.ui.ujian.doaMauBepergian

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMauBepergianEntity
import com.ndonga.speechdoa.utils.data

class DoaMauBepergianModel : ViewModel() {
    fun getDoaMauBepergian(): List<DoaMauBepergianEntity> = data.generateDoaMauBepergian()
}