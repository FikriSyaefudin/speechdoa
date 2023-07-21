package com.ndonga.speechdoa.ui.ujian.doaTurunHujan

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaTurunHujanEntity
import com.ndonga.speechdoa.utils.data

class doaTurunHujanModel: ViewModel(){
    fun getDoaTurunHujan(): List<DoaTurunHujanEntity> = data.generateDoaTurunHujan()
}