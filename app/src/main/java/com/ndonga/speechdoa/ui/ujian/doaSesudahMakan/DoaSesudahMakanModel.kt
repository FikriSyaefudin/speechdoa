package com.ndonga.speechdoa.ui.ujian.doaSesudahMakan

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaSesudahMakanEntity
import com.ndonga.speechdoa.utils.data

class DoaSesudahMakanModel : ViewModel() {
    fun getDoaSesudahMakan(): List<DoaSesudahMakanEntity> = data.generateDoaSesudahMakan()
}