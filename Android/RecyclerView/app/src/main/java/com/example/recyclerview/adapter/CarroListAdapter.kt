package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Carro

class CarroListAdapter(val listaCarro: ArrayList<Carro>, val onClickListener: OnClickListener) : RecyclerView.Adapter<CarroListAdapter.CarroViewHolder>() {

    var contadorOnCreate = 0
    var contadorOnBind = 0

    class CarroViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val textView: TextView = itemView.findViewById(R.id.text_modelo)
    }

    class OnClickListener(val clickListener: (carro:Carro) -> Unit){
        fun onClick(carro: Carro) = clickListener(carro)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        contadorOnCreate ++
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_carro_list, parent, false)

        return CarroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaCarro.size
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        contadorOnBind ++
        val carro = listaCarro[position]

        holder.textView.setText(carro.modelo)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(carro)
        }
    }
}