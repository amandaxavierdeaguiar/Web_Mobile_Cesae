package com.example.rootpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rootpage.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private val binding by lazy{
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonAtividade1.setOnClickListener{
            // Ir para a proxima pagina
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.buttonAtividade2.setOnClickListener{
            // Ir para a proxima pagina
            startActivity(Intent(this, MainActivity3::class.java))
        }

        binding.buttonAtividade3.setOnClickListener{
            // Ir para a proxima pagina
            startActivity(Intent(this, Euro::class.java))
        }
    }
}