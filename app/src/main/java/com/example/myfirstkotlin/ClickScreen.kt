package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myfirstkotlin.databinding.ActivityClickScreenBinding

class ClickScreen : AppCompatActivity() {

    private lateinit var binding: ActivityClickScreenBinding
    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_click_screen)

        binding.clickValue.text = value.toString()

        binding.buttonIncrement.setOnClickListener {
            val previousValue = value
            value++
            binding.clickValue.text = value.toString()
            val message = "Increment: $previousValue -> $value"
            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        }

        binding.buttonDecrement.setOnClickListener {
            val previousValue = value
            value--
            binding.clickValue.text = value.toString()
            val message = "Decrement: $previousValue -> $value"
            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        }

        binding.buttonReset.setOnClickListener {
            val previousValue = value
            value = 0
            binding.clickValue.text = value.toString()
            Toast.makeText(applicationContext, "Reset from $previousValue to 0", Toast.LENGTH_SHORT).show()
        }

        binding.buttonBack.setOnClickListener {
            finish()
        }
    }
}
