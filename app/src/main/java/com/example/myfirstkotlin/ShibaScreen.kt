package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ShibaScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shiba_screen)

        var cheems = findViewById<ImageView>(R.id.cheems)

        val feedButton: Button = findViewById(R.id.buttonFood)
        feedButton.setOnClickListener {
            cheems.setImageResource(R.drawable.calmshiba)
            Toast.makeText(applicationContext, "Good human!", Toast.LENGTH_SHORT).show()
        }
        val touchButton: Button = findViewById(R.id.buttonTouch)
        touchButton.setOnClickListener {
            cheems.setImageResource(R.drawable.angryshiba)
            Toast.makeText(applicationContext, "Bad human! No Touch", Toast.LENGTH_SHORT).show()
        }
        val buttonBack: Button = findViewById(R.id.button_back)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}