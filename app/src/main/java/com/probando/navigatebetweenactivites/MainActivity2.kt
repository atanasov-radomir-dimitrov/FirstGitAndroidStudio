package com.probando.navigatebetweenactivites

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.probando.navigatebetweenactivites.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentExtra = getIntent()
        val user = intentExtra.getStringExtra("user")
        binding.tv.text = user

        binding.bt.setOnClickListener {
            binding.activity2.setBackgroundColor(Color.LTGRAY)
        }

    }
}