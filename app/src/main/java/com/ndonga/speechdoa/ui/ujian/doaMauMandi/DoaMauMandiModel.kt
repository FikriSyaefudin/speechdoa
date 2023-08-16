package com.ndonga.speechdoa.ui.ujian.doaMauMandi

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMauMandiEntity
import com.ndonga.speechdoa.utils.data

class DoaMauMandiModel : ViewModel() {
    fun getDoaMauMandi(): List<DoaMauMandiEntity> = data.generateDoaMauMandi()
}