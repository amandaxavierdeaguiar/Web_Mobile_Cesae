package com.example.sharedproject

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("chave", Context.MODE_PRIVATE)
        val valor = sharedPreferences.getString("chave", "").toString()

        binding.editTextUsername.setText(valor)

        binding.buttonEntrarLogin.setOnClickListener{

            val username = binding.editTextUsername.text.toString()
            val password = binding.editTextPassword.text.toString()

            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("chave", binding.editTextUsername.text.toString())
            editor.apply()

            if(username.isNotEmpty() && password.isNotEmpty()){
                Toast.makeText(this, "login válido!", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_LONG).show()
            }
        }
    }
}