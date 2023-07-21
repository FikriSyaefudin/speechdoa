package com.ndonga.speechdoa.ui.ujian.doaMelihatMendung

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMelihatMendungEntity
import com.ndonga.speechdoa.utils.data

class DoaMelihatMendungModel: ViewModel(){
    fun getDoaMelihatMendung(): List<DoaMelihatMendungEntity> = data.generateDoaMelihatMendung()
}