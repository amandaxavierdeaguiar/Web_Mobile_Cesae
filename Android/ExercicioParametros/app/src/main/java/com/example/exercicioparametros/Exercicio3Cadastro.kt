package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicio3Binding

class Exercicio3Cadastro : AppCompatActivity() {
    private val binding by lazy{
        ActivityExercicio3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonCadastrar.setOnClickListener{
            val login = binding.editLogin.text.toString()
            val password = binding.editPassword.text.toString()
            val i = Intent(this, Exercicio3Login::class.java);
            i.putExtra("login", login)
            i.putExtra("password", password)
            startActivity(i)
        }
    }
}