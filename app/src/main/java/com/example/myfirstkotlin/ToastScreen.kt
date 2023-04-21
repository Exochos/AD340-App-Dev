package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_screen)

        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener {
            Toast.makeText(applicationContext, "You clicked mah button!", Toast.LENGTH_SHORT).show()
        }

        val buttonBack: Button = findViewById(R.id.button_back)
        buttonBack.setOnClickListener {
            finish()
        }

    }

}