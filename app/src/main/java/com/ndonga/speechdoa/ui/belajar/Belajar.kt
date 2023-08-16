package com.ndonga.speechdoa.ui.belajar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ndonga.speechdoa.R
import com.ndonga.speechdoa.api.api
import com.ndonga.speechdoa.api.url
import com.ndonga.speechdoa.ui.main.MainActivity
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.TimeUnit

class Belajar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar)
        val fullURL = url + "/" + api
        println(fullURL)
        val request: Request
        val client: OkHttpClient = OkHttpClient().newBuilder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS).build()
        request =
            Request.Builder()
                .url(fullURL)
                .build()

        client.newCall(request)
            .enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    e.printStackTrace()
                }

                override fun onResponse(call: Call, response: Response) {
                    val jsonData: String = response.body!!.string()
                    this@Belajar.runOnUiThread {
                        var data = JSONObject(jsonData)
                        println()
                        val loading = findViewById<TextView>(R.id.loading)
                        loading.visibility = View.INVISIBLE
                        if (jsonData == "api tidak merespon") {

                        } else {

                            // getting the recyclerview by its id
                            val recyclerview = findViewById<RecyclerView>(R.id.rv_doa)

                            // this creates a vertical layout Manager
                            recyclerview.layoutManager = LinearLayoutManager(this@Belajar)

                            // ArrayList of class ItemsViewModel
                            val dataa = data.getJSONArray("data")
                            println(dataa)
                            val data = ArrayList<ItemsViewModel>()

                            // This loop will create 20 Views containing
                            // the image with the count of view
                            val lastindex= dataa?.length()!! -1
                            println(lastindex)
                            for (i in 0..lastindex) {
                                val list_doa = JSONObject(dataa[i].toString())
                                println(list_doa)
                                println(list_doa["nama"].toString())
                                println(list_doa["isi"])
                                var nama = list_doa["nama"].toString()
                                var isi = list_doa["isi"].toString()
                                data.add(
                                    ItemsViewModel(
                                        nama,
                                        isi
                                    )
                                )
                            }

                            // This will pass the ArrayList to our Adapter
                            val adapter = CustomAdapter(data) { data -> personItemClicked(data) }

                            // Setting the Adapter with the recyclerview
                            recyclerview.adapter = adapter
                        }
                    }

                    response.body?.close()
                }

            })
        val button_back = findViewById<ImageView>(R.id.btn_back)
        button_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun personItemClicked(person: ItemsViewModel) {
        println(person.isi)
        val list_isi = JSONArray(person.isi)
        val lastindex= list_isi?.length()!! -1

        println(lastindex)
        for (i in 0..lastindex) {
            println(list_isi[i].toString())
        }

        val intent = Intent(this, DetailBelajar::class.java)
        intent.putExtra("isi",person.isi.toString())
        intent.putExtra("nama",person.text.toString())
        startActivity(intent)


    }

}