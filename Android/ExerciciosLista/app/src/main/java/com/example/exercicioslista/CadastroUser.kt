package com.example.exercicioslista

import java.io.Serializable

class CadastroUser (
            val nome:String,
            val username:String,
            val email:String,
            val password: String,
            val telefone: String,
            val documento: String,
):Serializable {
    override fun toString(): String {
        return "$nome"
    }
}
