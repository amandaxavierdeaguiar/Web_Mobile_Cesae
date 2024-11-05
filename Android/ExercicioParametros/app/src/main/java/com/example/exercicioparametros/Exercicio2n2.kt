package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicio2n2Binding

class Exercicio2n2 : AppCompatActivity() {
    private val binding by lazy{
        ActivityExercicio2n2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val i = intent

        val num1 = i.extras?.getString("num1")

        binding.buttonNumero2.setOnClickListener{
            val num2 = binding.editNumero2.text.toString()
            val i = Intent(this, Exercicio2resultado::class.java);
            i.putExtra("num1", num1)
            i.putExtra("num2", num2)
            startActivity(i)
        }
    }
}