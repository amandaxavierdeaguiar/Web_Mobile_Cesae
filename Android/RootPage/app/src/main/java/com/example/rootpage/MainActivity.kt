package com.example.rootpage

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.rootpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMensagem.setOnClickListener{
            Toast.makeText(applicationContext, "Botao Clicado", Toast.LENGTH_LONG).show()
        }

        binding.buttonNewpage.setOnClickListener{
            // Ir para a proxima pagina
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}
