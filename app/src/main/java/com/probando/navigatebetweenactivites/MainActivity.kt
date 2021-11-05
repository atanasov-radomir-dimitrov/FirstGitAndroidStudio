package com.probando.navigatebetweenactivites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.probando.navigatebetweenactivites.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bt.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("user", binding.et.text.toString())

            startActivity(intent)
            binding.et.hint = "Put your name"
            binding.et.setText("")

        }
    }

}