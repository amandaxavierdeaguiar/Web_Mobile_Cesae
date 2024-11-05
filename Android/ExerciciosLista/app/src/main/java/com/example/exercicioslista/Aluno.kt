package com.example.exercicioslista

class Aluno(val nome:String, val morada:String, val email:String){
    override fun toString(): String {
        return "$nome"
    }
}