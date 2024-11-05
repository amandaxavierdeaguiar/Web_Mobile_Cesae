package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonEntre.setOnClickListener{
            val nome = binding.editNome.text.toString()
            val morada = binding.editMorada.text.toString()
            val telefone = binding.editPhone.text.toString()
            val email = binding.editEmail.text.toString()

            val i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("nome", nome)
            i.putExtra("morada", morada)
            i.putExtra("telefone", telefone)
            i.putExtra("email", email)
            startActivity(i)
        }
    }
}