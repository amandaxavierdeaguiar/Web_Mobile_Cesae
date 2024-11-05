package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicioLoginBinding

class Exercicio3Login : AppCompatActivity() {
    private val binding by lazy{
        ActivityExercicioLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val i = intent
        val login = i.extras?.getString("login")
        val password = i.extras?.getString("password")

        binding.buttonEntrar.setOnClickListener{
            val loginEntrar = binding.editEmailAddress.text.toString()
            val passwordEntrar = binding.editTextPassword.text.toString()

            if(login.equals(loginEntrar) && password.equals(passwordEntrar)){
                val intent = Intent(this, Exercicio3Sobre::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Credenciais Erradas!", Toast.LENGTH_SHORT).show()
                binding.editEmailAddress.text.clear()
                binding.editTextPassword.text.clear()
            }
        }
    }
}