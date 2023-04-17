package com.example.speechdoa.ui.ujian.doaMelihatMendung

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaMelihatMendungEntity
import com.example.speechdoa.utils.data

class DoaMelihatMendungModel: ViewModel(){
    fun getDoaMelihatMendung(): List<DoaMelihatMendungEntity> = data.generateDoaMelihatMendung()
}