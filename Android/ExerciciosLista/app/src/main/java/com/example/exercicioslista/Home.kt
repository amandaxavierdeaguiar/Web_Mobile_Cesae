package com.example.exercicioslista

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private val binding by lazy{
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonAtividade1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.buttonAtividade2.setOnClickListener{
            val intent = Intent(this, Atividade2::class.java)
            startActivity(intent)
        }

        binding.buttonAtividade3.setOnClickListener{
            val intent = Intent(this, Atividade3::class.java)
            startActivity(intent)
        }

        binding.buttonAtividade4.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}