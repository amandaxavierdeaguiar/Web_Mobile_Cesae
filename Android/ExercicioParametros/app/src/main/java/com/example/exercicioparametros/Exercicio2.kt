package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicio2Binding

class Exercicio2 : AppCompatActivity() {
    private val binding by lazy{
        ActivityExercicio2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonNumero1.setOnClickListener{
            val num1 = binding.editNumero1.text.toString()
            val i = Intent(this, Exercicio2n2::class.java);
            i.putExtra("num1", num1)
            startActivity(i)
        }
    }
}