package com.example.utsno1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_fakultas.view.*

class AdapterFakultas (val itemfakultas : List<DataFakultas>,
                       val clickListener: (DataFakultas) -> Unit) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_fakultas, parent, false)
        return PartViewHolder (view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemfakultas[position], clickListener)
    }

    override fun getItemCount() = itemfakultas.size

    class PartViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(data : DataFakultas, clickListener: (DataFakultas) -> Unit) {
            itemView.gambarfak.setImageResource(data.gambarfakultas)
            itemView.listfak.text = data.namafakultas
            itemView.setOnClickListener{clickListener(data)}
        }

    }

}