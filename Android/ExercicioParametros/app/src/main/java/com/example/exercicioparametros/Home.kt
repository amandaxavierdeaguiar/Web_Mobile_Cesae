package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private val binding by lazy{
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonAtividade1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.buttonAtividade2.setOnClickListener{
            val intent = Intent(this, Exercicio2::class.java)
            startActivity(intent)
        }

        binding.buttonAtividade3.setOnClickListener{
            val intent = Intent(this, Exercicio3Home::class.java)
            startActivity(intent)
        }
    }
}