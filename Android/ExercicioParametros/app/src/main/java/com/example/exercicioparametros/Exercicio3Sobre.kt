package com.example.exercicioparametros

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicioLoginBinding

class Exercicio3Sobre : AppCompatActivity() {
    private val binding by lazy{
        ActivityExercicioLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}