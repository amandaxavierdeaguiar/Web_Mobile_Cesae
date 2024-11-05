package com.example.rootpage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rootpage.databinding.ActivityEuroBinding

class Euro : AppCompatActivity() {
    private val binding by lazy{
        ActivityEuroBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonDolar.setOnClickListener {
            val
        }
        binding.buttonReal.setOnClickListener {
            val euro: Double = binding.editEuros.text.toString().toDouble()
            val valorConvertido: Double = euro * 
        }
        binding.buttonEuro.setOnClickListener {

        }
    }
}