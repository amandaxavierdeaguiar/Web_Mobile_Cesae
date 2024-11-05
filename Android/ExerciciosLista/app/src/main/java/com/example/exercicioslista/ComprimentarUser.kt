package com.example.exercicioslista

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityComprimentarUserBinding

class ComprimentarUser : AppCompatActivity() {

    private val binding by lazy{
        ActivityComprimentarUserBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




    }
}