package com.example.mahanttan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val recoger = findViewById<TextView>(R.id.txtRecoger)
        intent.extras?.getString("dato","No llego el Dato")?.let{
            recoger.setText(it)
        }
    }
}