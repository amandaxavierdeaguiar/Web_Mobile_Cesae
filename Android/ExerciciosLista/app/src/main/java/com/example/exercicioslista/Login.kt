package com.example.exercicioslista

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private val binding by lazy{
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val usernameLogin = binding.editTextUsernameLogin.text.toString()

    binding.buttonCadastrar.setOnClickListener{
        val intent = Intent(this, Cadastro::class.java)
        startActivity(intent)
    }

    }
}