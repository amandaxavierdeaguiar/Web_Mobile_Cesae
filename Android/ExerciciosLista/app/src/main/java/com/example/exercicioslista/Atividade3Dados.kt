package com.example.exercicioslista

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityAtividade3DadosBinding

class Atividade3Dados : AppCompatActivity() {
    private val binding by lazy{
        ActivityAtividade3DadosBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent
        val nome = i.extras?.getString("nome_aluno")
        val morada = i.extras?.getString("morada_aluno")
        val email = i.extras?.getString("email_aluno")

        binding.textViewNome.text = nome
        binding.textViewMorada.text = morada
        binding.textViewEmail.text = email
    }
}