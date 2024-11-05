package com.example.androidfinal.data

import com.example.androidfinal.model.Produto

class ProdutoMock() {
    var listaProdutos = ArrayList<Produto>()

    init {
        listaProdutos.add(Produto( "Bolinho de Camarão", 10.00))
        listaProdutos.add(Produto( "Bolinho de Bacalhau", 10.00))
        listaProdutos.add(Produto( "Bolinho de Bacalhau com Queijo", 10.00))
        listaProdutos.add(Produto( "Bolinho de Camarão com Queijo", 10.00))
        listaProdutos.add(Produto( "Bolinho de Queijo da Serra", 10.00))
    }
}


    /*init {
        for (i in 0..100) {
            listaProdutos.add(Produto(i, "Produto $i", (i + 1) * 10.0))
        }
    }*/
