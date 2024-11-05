package com.example.rootpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rootpage.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
        // Sempre por o nome Activity + O nome + Binding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonLogin.setOnClickListener {
            val username: String = binding.editUsername.text.toString();
            val password: String = binding.editPassword.text.toString();

            if (username.equals("user") && password.equals("pass")) {
                // Passamos para a Activity de Login ok
                val intent = Intent(this, LoginOk::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, LoginErrado::class.java)
                startActivity(intent)
            }
        }
    }
}