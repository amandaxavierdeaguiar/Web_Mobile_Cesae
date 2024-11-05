package com.example.recyclerview.data

import com.example.recyclerview.model.Carro

class CarroMock() {
    var listaCarros = ArrayList<Carro>()

    init {
        for(i in 0..100){
            listaCarros.add(Carro(i, i.toString()))
        }
    }
}