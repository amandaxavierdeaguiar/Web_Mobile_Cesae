package com.example.exercicioparametros

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy{
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")
        val morada = i.extras?.getString("morada")
        val telefone = i.extras?.getString("telefone")
        val email = i.extras?.getString("email")

        binding.textNome.text = "Olá ${nome}\nRua: ${morada}\nTelefone: ${telefone}\nEmail: ${email}";

    }
}