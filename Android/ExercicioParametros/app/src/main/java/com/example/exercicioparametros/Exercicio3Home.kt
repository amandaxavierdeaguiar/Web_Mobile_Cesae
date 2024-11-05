package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicio3HomeBinding

class Exercicio3Home : AppCompatActivity() {

    private val binding by lazy{
        ActivityExercicio3HomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonCadastro.setOnClickListener{
            val intent = Intent(this, Exercicio3Cadastro::class.java)
            startActivity(intent)
        }
    }
}