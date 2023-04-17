package com.example.speechdoa.ui.ujian.doaMauMakan

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaMauMakanEntity
import com.example.speechdoa.data.DoaTidurEntity
import com.example.speechdoa.utils.data

class DoaMauMakanModel: ViewModel() {
    fun getDoaMauMakan(): List<DoaMauMakanEntity> = data.generateDoaMauMakan()
}