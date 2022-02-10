package com.example.contatosntt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter: RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun updateList(list: List<Contact>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class ContactAdapterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val tv_nome: TextView = itemView.findViewById(R.id.tv_nome)
        private val tv_fone: TextView = itemView.findViewById(R.id.tv_fone)
        private val iv_foto: ImageView = itemView.findViewById(R.id.iv_foto)

        fun bind(contact: Contact){
            tv_nome.text = contact.nome
            tv_fone.text = contact.fone

        }

    }
}