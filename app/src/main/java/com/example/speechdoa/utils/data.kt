package com.example.speechdoa.utils

import com.example.speechdoa.data.*

object data {

    fun generateDoaTidur(): List<DoaTidurEntity>{
        var DoaTidur = ArrayList<DoaTidurEntity>()

        DoaTidur.add(
            DoaTidurEntity(
                "باسمك اللهم احيا وباسمك اموت"
                ))

        return DoaTidur
    }

    fun generateDoaSesudahTidur(): List<DoaSesudahTidurEntity>{
        var DoaSesudahTidur = ArrayList<DoaSesudahTidurEntity>()

        DoaSesudahTidur.add(
            DoaSesudahTidurEntity(
                "الحمد لله الذي احيانا بعد ما اماتنا واليه النشور"
            )
        )

        return DoaSesudahTidur
    }

    fun generateDoaMauMakan(): List<DoaMauMakanEntity>{
        var DoaMauMakan = ArrayList<DoaMauMakanEntity>()

        DoaMauMakan.add(
            DoaMauMakanEntity(
                "اللهم بارك لنا فيما رزقتنا وقنا عذاب النار"
            ))

        return DoaMauMakan
    }

    fun generateDoaSesudahMakan(): List<DoaSesudahMakanEntity>{
        var DoaSesudahMakan = ArrayList<DoaSesudahMakanEntity>()

        DoaSesudahMakan.add(
            DoaSesudahMakanEntity(
                "الحمد لله الذي اطعمنا وسقانا وجعلنا من المسلمين"
            )
        )

        return DoaSesudahMakan
    }

    fun generateDoaMengawaliPekerjaan(): List<DoaMengawaliPekerjaanEntity>{
        var DoaMengawaliPekerjaan = ArrayList<DoaMengawaliPekerjaanEntity>()

        DoaMengawaliPekerjaan.add(
            DoaMengawaliPekerjaanEntity(
                "بسم الله الرحمن الرحيم"
            )
        )

        return DoaMengawaliPekerjaan
    }

    fun generateDoaMengakhiriPekerjaan(): List<DoaMengakhiriPekerjaanEntity>{
        var DoaMengakhiriPekerjaan = ArrayList<DoaMengakhiriPekerjaanEntity>()

        DoaMengakhiriPekerjaan.add(
            DoaMengakhiriPekerjaanEntity(
                "الحمد لله رب العالمين"
            )
        )

        return DoaMengakhiriPekerjaan
    }

    fun generateDoaMasukKamarMandi(): List<DoaMasukKamarMandiEntity>{
        var DoaMasukKamarMandi = ArrayList<DoaMasukKamarMandiEntity>()

        DoaMasukKamarMandi.add(
            DoaMasukKamarMandiEntity(
                "اللهم اني اعوذبك من الخبث والخبائث"
            )
        )

        return DoaMasukKamarMandi
    }

    fun generateDoaKeluarKamarMandi(): List<DoaKeluarKamarMandiEntity>{
        var DoaKeluarKamarMandi = ArrayList<DoaKeluarKamarMandiEntity>()

        DoaKeluarKamarMandi.add(
            DoaKeluarKamarMandiEntity(
                "الحمد لله الذى اذهب عنى اْلاذى وعافانى"
            )
        )

        return DoaKeluarKamarMandi
    }

    fun generateDoaMasukMasjid(): List<DoaMasukMasjidEntity>{
        var DoaMasukMasjid = ArrayList<DoaMasukMasjidEntity>()

        DoaMasukMasjid.add(
            DoaMasukMasjidEntity(
                "اللهم افتح لي ابواب رحمتك"
            )
        )

        return DoaMasukMasjid
    }

    fun generateDoaKeluarMasjid(): List<DoaKeluarMasjidEntity>{
        var DoaKeluarMasjid = ArrayList<DoaKeluarMasjidEntity>()

        DoaKeluarMasjid.add(
            DoaKeluarMasjidEntity(
                "اللهم افتح لي ابواب فضلك"
            )
        )

        return DoaKeluarMasjid
    }

    fun generateDoaMelihatMendung(): List<DoaMelihatMendungEntity>{
        var DoaMelihatMendung = ArrayList<DoaMelihatMendungEntity>()

        DoaMelihatMendung.add(
            DoaMelihatMendungEntity(
                "اللهم انا نعوذ بك من شر ما ارسل به"
            )
        )

        return DoaMelihatMendung
    }

    fun generateDoamelihatkilat(): List<DoaMelihatKilatEntity>{
        var DoaMelihatKilat = ArrayList<DoaMelihatKilatEntity>()

        DoaMelihatKilat.add(
            DoaMelihatKilatEntity(
                "سبحان من يريكم البرق خوفا وطمعا"
            )
        )

        return DoaMelihatKilat
    }

    fun generateDoaTurunHujan(): List<DoaTurunHujanEntity>{
        var DoaTurunHujan = ArrayList<DoaTurunHujanEntity>()

        DoaTurunHujan.add(
            DoaTurunHujanEntity(
                "اللهم صيبا نافعا"
            )
        )

        return DoaTurunHujan
    }

    fun generateDoaKetikaHujanLebat(): List<DoaKetikaHujanLebatEntity>{
        var DoaKetikaHujanLebat = ArrayList<DoaKetikaHujanLebatEntity>()

        DoaKetikaHujanLebat.add(
            DoaKetikaHujanLebatEntity(
                "اللهم اغثنا اللهم اغثنا اللهم اغثنا"
            )
        )

        return DoaKetikaHujanLebat
    }

    fun generateDoaKetikaHujanReda(): List<DoaKetikaHujanRedaEntity>{
        var DoaKetikaHujanReda = ArrayList<DoaKetikaHujanRedaEntity>()

        DoaKetikaHujanReda.add(
            DoaKetikaHujanRedaEntity(
                "مطرنا بفضل الله ورحمته"
            )
        )

        return DoaKetikaHujanReda
    }

}