package com.example.exercicioslista

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityRecuperarPasswordBinding

class RecuperarPassword : AppCompatActivity() {
    private val binding by lazy{
        ActivityRecuperarPasswordBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}