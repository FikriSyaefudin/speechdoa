package com.ndonga.speechdoa.ui.ujian.doaMasukKamarMandi

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMasukKamarMandiEntity
import com.ndonga.speechdoa.utils.data

class DoaMasukKamarMandiModel : ViewModel() {
    fun getDoaMasukKamarMandi(): List<DoaMasukKamarMandiEntity> = data.generateDoaMasukKamarMandi()
}