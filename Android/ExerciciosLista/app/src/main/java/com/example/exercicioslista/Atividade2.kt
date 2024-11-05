package com.example.exercicioslista

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityAtividade2Binding

class Atividade2 : AppCompatActivity() {
    private val binding by lazy{
        ActivityAtividade2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaInteiros = ArrayList<Int>()

        binding.buttonInserirValores.setOnClickListener {

            val novoNumero = binding.textViewInserirValor.text.toString().toInt()
            listaInteiros.add(novoNumero)

            val arrayAdapter = ArrayAdapter(this, R.layout.simple_list_item_1, listaInteiros)
            binding.listViewAtividade2.adapter = arrayAdapter
        }

    }
}