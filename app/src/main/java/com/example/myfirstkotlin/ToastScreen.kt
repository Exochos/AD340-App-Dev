package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myfirstkotlin.databinding.ActivityToastScreenBinding

class ToastScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityToastScreenBinding>(this, R.layout.activity_toast_screen)

        binding.button0.setOnClickListener {
            Toast.makeText(applicationContext, "You clicked mah button!", Toast.LENGTH_SHORT).show()
        }

        binding.buttonBack.setOnClickListener {
            finish()
        }
    }
}