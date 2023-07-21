package com.ndonga.speechdoa.ui.ujian.doaMauMakan

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMauMakanEntity
import com.ndonga.speechdoa.utils.data

class DoaMauMakanModel: ViewModel() {
    fun getDoaMauMakan(): List<DoaMauMakanEntity> = data.generateDoaMauMakan()
}