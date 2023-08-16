package com.ndonga.speechdoa.ui.ujian.doaMemakaiPakaian

import androidx.lifecycle.ViewModel
import com.ndonga.speechdoa.data.DoaMemakaiPakaianEntity
import com.ndonga.speechdoa.utils.data

class DoaMemakaiPakaianModel : ViewModel() {
    fun getDoaMemakaiPakaian(): List<DoaMemakaiPakaianEntity> = data.generateDoaMemakaiPakaian()
}