package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView

class ClickScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_screen)


        val clickView = findViewById<TextView>(R.id.clickValue)
        var value = clickView.text.toString().toInt()

        Toast.makeText(applicationContext, value.toString(), Toast.LENGTH_SHORT).show()

        val buttonIncrement: Button = findViewById(R.id.buttonIncrement)
        buttonIncrement.setOnClickListener {
            val previousValue = value
            value++
            clickView.text = value.toString()
            val message = "Increment: " + previousValue + " -> " + value
            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        }

        val buttonDecrement: Button = findViewById(R.id.buttonDecrement)
        buttonDecrement.setOnClickListener {
            val previousValue = value
            value--
            clickView.text = value.toString()
            val message = "Decrement: " + previousValue + " -> " + value
            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        }

        val buttonReset: Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener {
            val previousValue = value
            value = 0;
            clickView.text = value.toString()
            Toast.makeText(applicationContext, "Reset from " + previousValue + " to 0", Toast.LENGTH_SHORT).show()
        }
        val buttonBack: Button = findViewById(R.id.button_back)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}