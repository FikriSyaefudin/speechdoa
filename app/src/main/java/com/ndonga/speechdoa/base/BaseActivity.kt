package com.ndonga.speechdoa.base

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate

open class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode( AppCompatDelegate.MODE_NIGHT_NO )
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
}