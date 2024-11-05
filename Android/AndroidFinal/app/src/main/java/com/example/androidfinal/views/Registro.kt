package com.example.androidfinal.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityRegistroBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class Registro : AppCompatActivity() {
    private val binding by lazy{
        ActivityRegistroBinding.inflate(layoutInflater)
    }

    private val auth by lazy {
        FirebaseAuth.getInstance()
    }

    private val db by lazy {
        FirebaseFirestore.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonRegisto.setOnClickListener{
            val email = binding.editEmail.text.toString()
            val passwd = binding.editPassword.text.toString()

            //Para desligar o login anterior
            auth.signOut()

            auth.createUserWithEmailAndPassword(email, passwd)
                .addOnSuccessListener {
                    Toast.makeText(this, "Registro realizado com sucesso", Toast.LENGTH_SHORT).show()

                    //Email de verificacao
                    auth.currentUser?.sendEmailVerification()

                    gravarUtilizadorDB(email)

                    finish()
                }
                .addOnFailureListener{
                    Toast.makeText(this, "Erro ao registrar utilizador!", Toast.LENGTH_SHORT).show()
                }
        }
    }

    private fun gravarUtilizadorDB(email: String){
        val uid = auth.currentUser?.uid

        val dados = mapOf(
            "nome" to "",
            "email" to email
        )

        db.collection("utilizadores")
            .document(uid.toString())
            .set(dados)
            .addOnSuccessListener {
                Toast.makeText(this, "Adicionado com sucesso", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener {
                Toast.makeText(this, "Erro", Toast.LENGTH_SHORT).show()
            }
    }

}