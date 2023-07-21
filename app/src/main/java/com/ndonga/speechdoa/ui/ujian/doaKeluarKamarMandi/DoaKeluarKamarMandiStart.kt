package com.ndonga.speechdoa.ui.ujian.doaKeluarKamarMandi

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.ndonga.speechdoa.R
import com.ndonga.speechdoa.base.BaseActivity
import com.ndonga.speechdoa.data.DoaKeluarKamarMandiEntity
import com.ndonga.speechdoa.databinding.ActivityDoaKeluarKamarMandiStartBinding

class DoaKeluarKamarMandiStart : BaseActivity() {
    private lateinit var binding: ActivityDoaKeluarKamarMandiStartBinding
    var listDoaKeluarKamarMandi = ArrayList<DoaKeluarKamarMandiEntity>()

    var current_position = 0
    var hasil = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaKeluarKamarMandiStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        println(this::binding.isInitialized)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            DoaKeluarKamarMandiModel::class.java)
        val doaKeluarkamarmandi = viewModel.getDoaKeluarKamarMandi()

        listDoaKeluarKamarMandi.addAll(doaKeluarkamarmandi)

        binding.btnMic.setOnClickListener {
            checkAudioPermission()
            binding.btnMic.setColorFilter(ContextCompat.getColor(this, R.color.mic_enabled_color))
            startSpeechToText()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }

    }

    private fun startSpeechToText() {
        val speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this)
        val speechRecognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)

        speechRecognizerIntent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE_MODEL,
            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        )
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar")

        speechRecognizer.setRecognitionListener(object : RecognitionListener {
            override fun onReadyForSpeech(p0: Bundle?) {}

            override fun onBeginningOfSpeech() {}

            override fun onRmsChanged(p0: Float) {}

            override fun onBufferReceived(p0: ByteArray?) {}

            override fun onEndOfSpeech() {
                binding.btnMic.setColorFilter(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.mic_disabled_color
                    )
                )
            }

            override fun onError(p0: Int) {}
            override fun onResults(bundle: Bundle) {
                val result = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                if (result != null) {
                    println(result[0])
                    if (current_position < listDoaKeluarKamarMandi.size - 1) {
                        if (result[0] == listDoaKeluarKamarMandi[current_position].doa) {
                            println(result[0])
                            current_position++
                            hasil = "Benar"
                            Toast.makeText(applicationContext, "Benar", Toast.LENGTH_SHORT).show()
                        } else {
                            hasil = "Salah"
                            current_position++
                            Toast.makeText(applicationContext, "Kurang Tepat", Toast.LENGTH_SHORT)
                                .show()
                        }
                    } else if (result[0] == listDoaKeluarKamarMandi[current_position].doa) {
                        println(result[0])
                        hasil = "Benar"
                        Toast.makeText(applicationContext, "Benar", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext, DoaKeluarKamarMandiDone::class.java)
                        intent.putExtra(DoaKeluarKamarMandiDone.HASIL, hasil)
                        intent.putExtra(DoaKeluarKamarMandiDone.SOAL, listDoaKeluarKamarMandi[current_position].doa)
                        intent.putExtra(DoaKeluarKamarMandiDone.JAWABAN, result[0])
                        startActivity(intent)
                        finish()
                    } else {
                        hasil = "Salah"
                        Toast.makeText(applicationContext, "Kurang Tepat", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent(applicationContext, DoaKeluarKamarMandiDone::class.java)
                        intent.putExtra(DoaKeluarKamarMandiDone.HASIL, hasil)
                        intent.putExtra(DoaKeluarKamarMandiDone.SOAL, listDoaKeluarKamarMandi[current_position].doa)
                        intent.putExtra(DoaKeluarKamarMandiDone.JAWABAN, result[0])
                        startActivity(intent)
                        finish()
                    }
                }
            }

            override fun onPartialResults(p0: Bundle?) {}

            override fun onEvent(p0: Int, p1: Bundle?) {}

        })
        speechRecognizer.startListening(speechRecognizerIntent)
    }

    private fun checkAudioPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {  // M = 23
            if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != PackageManager.PERMISSION_GRANTED) {
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:com.ndonga.speechdoa"))
                startActivity(intent)
                Toast.makeText(this, "Allow Microphone Permission", Toast.LENGTH_SHORT).show()
            }
        }
    }
}