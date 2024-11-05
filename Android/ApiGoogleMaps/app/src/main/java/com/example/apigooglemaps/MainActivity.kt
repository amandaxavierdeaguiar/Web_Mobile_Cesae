package com.example.apigooglemaps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apigooglemaps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    binding.buttonAtividade1.setOnClickListener{
        val intent = Intent(this, PosicaoMaps::class.java)
        startActivity(intent)
    }
    }
}