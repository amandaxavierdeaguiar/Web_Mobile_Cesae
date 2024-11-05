package com.example.listadecomprasetarefas

import java.io.Serializable

class Produto (val produto:String):Serializable {
    override fun toString(): String {
        return "$produto"
    }
}