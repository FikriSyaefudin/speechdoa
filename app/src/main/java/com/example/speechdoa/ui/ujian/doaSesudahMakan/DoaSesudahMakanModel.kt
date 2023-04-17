package com.example.speechdoa.ui.ujian.doaSesudahMakan

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaSesudahMakanEntity
import com.example.speechdoa.utils.data

class DoaSesudahMakanModel : ViewModel() {
    fun getDoaSesudahMakan(): List<DoaSesudahMakanEntity> = data.generateDoaSesudahMakan()
}