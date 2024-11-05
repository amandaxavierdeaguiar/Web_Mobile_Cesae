package com.example.sharedatividades

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedatividades.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy{
        ActivityMain2Binding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("chave2", Context.MODE_PRIVATE)
        val valor = sharedPreferences.getString("chave2", "").toString()

        binding.editTextEscreverNota.setText(valor)

        binding.buttonNota.setOnClickListener {

            val escreverNota = binding.editTextEscreverNota.text.toString()

            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("chave2", escreverNota)
            editor.apply()

            binding.textViewNota.text = escreverNota
        }
    }
}