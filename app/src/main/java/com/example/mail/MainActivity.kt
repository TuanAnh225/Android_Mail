package com.example.mail

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<MailModel>()
        repeat(5){
            val index = it + 10
            items.add(MailModel(
                resources.getIdentifier("thumb$index", "drawable", packageName),
                "Noi dung $index",
                "12324632746387246237846238746286328743628shajdkhasdjk",
                "9:50 PM")
            )
        }
        findViewById<GridView>(R.id.grid_layout).adapter = MailAdapter(items)
    }
}