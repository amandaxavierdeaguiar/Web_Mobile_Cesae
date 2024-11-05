package com.example.androidfinal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfinal.R
import com.example.androidfinal.model.Produto

class ProdutoListAdapter(val listaProduto: ArrayList<Produto>, val onClickComprar: (Produto) -> Unit)
    :RecyclerView.Adapter<ProdutoListAdapter.ProdutoViewHolder>() {
    class ProdutoViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val textView: TextView = itemView.findViewById(R.id.text_modelo)
        val textPreco: TextView = itemView.findViewById(R.id.text_preco)
        val buttonComprar: Button = itemView.findViewById(R.id.button_comprar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_produto_list, parent, false)

        return ProdutoViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listaProduto.size
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = listaProduto[position]
        holder.textView.text = produto.modelo
        holder.textPreco.text = "${produto.preco}€"

        holder.buttonComprar.setOnClickListener {
            onClickComprar(produto) // Chama a função de clique
        }
        /*holder.textView.setText(produto.modelo)*/
    }
}