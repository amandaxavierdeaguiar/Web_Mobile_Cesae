package com.example.exercicioparametros

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicio2resultadoBinding

class Exercicio2resultado : AppCompatActivity() {
    private val binding by lazy{
        ActivityExercicio2resultadoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val i = intent
        val num1 = i.extras?.getString("num1").toString().toDouble()
        val num2 = i.extras?.getString("num2").toString().toDouble()

        val soma = num1 + num2;
        val diferenca = num1 - num2;
        val produto = num1 * num2;
        val divisao = num1 / num2;

        binding.textSoma.text = "${num1} + ${num2} = " + soma;
        binding.textDiferenca.text = "${num1} - ${num2} = " + diferenca;
        binding.textProduto.text = "${num1} X ${num2} = " + produto;
        binding.textDivisao.text = "${num1} / ${num2} = " + divisao;
    }
}