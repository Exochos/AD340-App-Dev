package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.week3toast)
        button1.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToastScreen::class.java))
        }
        val button2: Button = findViewById(R.id.week3click)
        button2.setOnClickListener {
            startActivity(Intent(this@MainActivity, ClickScreen::class.java))
        }
        val button3: Button = findViewById(R.id.week3shiba)
        button3.setOnClickListener {
            startActivity(Intent(this@MainActivity, ShibaScreen::class.java))
        }

        val button4: Button = findViewById(R.id.week5recycler)
        button4.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecyclerScreen::class.java))
        }
        val button5: Button = findViewById(R.id.week5recyclerpersonal)
        button5.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecyclerPersonalScreen::class.java))
        }
    }

}