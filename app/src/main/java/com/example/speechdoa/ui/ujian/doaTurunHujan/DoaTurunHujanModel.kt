package com.example.speechdoa.ui.ujian.doaTurunHujan

import androidx.lifecycle.ViewModel
import com.example.speechdoa.data.DoaTurunHujanEntity
import com.example.speechdoa.utils.data

class doaTurunHujanModel: ViewModel(){
    fun getDoaTurunHujan(): List<DoaTurunHujanEntity> = data.generateDoaTurunHujan()
}