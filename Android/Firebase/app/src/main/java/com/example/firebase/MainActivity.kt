package com.example.firebase

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val auth by lazy {
        FirebaseAuth.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val passwd = binding.editPassword.text.toString()

            auth.signInWithEmailAndPassword(email, passwd)
                .addOnSuccessListener {
                    if (auth.currentUser?.isEmailVerified == true) {
                        Toast.makeText(this, "Login OK", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Conta não validada", Toast.LENGTH_SHORT).show()
                    }
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Erro no Login: ${it.message}", Toast.LENGTH_SHORT).show()
                }
        }
        binding.textCriarConta.setOnClickListener {
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }

    }
}