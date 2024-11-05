package com.example.exercicioslista

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityCadastroBinding
import com.example.exercicioslista.databinding.ActivityLoginBinding

class Cadastro : AppCompatActivity() {
    private val binding by lazy{
        ActivityCadastroBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listUser = ArrayList<CadastroUser>()

        binding.buttonCadastrase.setOnClickListener {
            val nome = binding.editTextNome.text.toString();
            val username = binding.editTextUsername.text.toString()
            val email = binding.editTextCadastroEmail.text.toString()
            val password = binding.editCadastroPassword.text.toString()
            val telefone = binding.editTextPhone.text.toString()
            val documento = binding.editTextDocumento.text.toString()

            listUser.add(CadastroUser(nome, username, email, password, telefone, documento))

            // TOAST CADASTRO REALIZADO COM SUCESSO
            Toast.makeText(this, "CADASTRO REALIZADO COM SUCESSO!", Toast.LENGTH_LONG).show()
        }

        binding.buttonLoginCadastro.setOnClickListener{
            val intent = Intent(this, ActivityLoginBinding::class.java)
            startActivity(intent)
        }
    }
}