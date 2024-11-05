package com.example.rootpage

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.rootpage.databinding.ActivityLoginErradoBinding

class LoginErrado : AppCompatActivity() {
    private val binding by lazy {
        ActivityLoginErradoBinding.inflate(layoutInflater)
        // Sempre por o nome Activity + O nome + Binding
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonVoltarLogin.setOnClickListener{
            Toast.makeText(applicationContext, "Login Errado", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}