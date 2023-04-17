package com.example.speechdoa.ui.ujian

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import com.example.speechdoa.databinding.ActivityCobaBinding


class coba:AppCompatActivity() {
    private lateinit var binding: ActivityCobaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCobaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bla = "اللهم صيبا نافعا"

        var kal1 = "اللهم"
        var kal2 = "صيبا"
        var kal3 = "نافعا"
        val jwb = "صيبا اللهم"
        val jmlstr = 3
        var jmlslh = 0
        if (jwb == kal1) {
            kal1 = "<font color=#FF641A>" + kal1 + "</font>"
            print(jwb)
            print("\n")
            jmlslh = jmlslh + 1
        } else{
            kal1 = "<font color=#2aad46>" + kal1 + "</font>"
        }
        if (jwb == kal2) {
            kal2 = "<font color=#FF641A>" + kal2 + "</font>"
            print(jwb)
            print("\n")
            jmlslh = jmlslh + 1
        } else{
            kal2 = "<font color=#2aad46>" + kal2 + "</font>"
        }
        if (jwb == kal3) {
            kal3 = "<font color=#FF641A>" + kal3 + "</font>"
            print(jwb)
            print("\n")
            jmlslh = jmlslh + 1
        } else {
            kal3 = "<font color=#2aad46>" + kal3 + "</font>"
        }
/* for (c in bla) {
    for (d in jwb){
       if (c.toString()==d.toString()){
        print(c)
        print("\n")
        jmlbnr = jmlbnr+1

    }
  }
  }*/
        print(jmlstr)
        print("\n")
        val jmlbnr = jmlstr - jmlslh
        print(jmlbnr)
        print("\n")
        print(kal1 + kal2 + kal3)
        print("\n")
        val hasil = jmlbnr * (100 / jmlstr)
        print(hasil)
        print("%")
        val text =kal1 +" "+ kal2 +" "+ kal3+"\n\n score : \n"+hasil+"%"
        binding.textcoba.text= Html.fromHtml(text)

    }
}