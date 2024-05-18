package dev.jp.parcial_jeanpierre.ui.Pmodelado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import dev.jp.parcial_jeanpierre.R

class AdapterPrize(private var lstGEN: List<ModeloPrize>) :
    RecyclerView.Adapter<AdapterPrize.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imgGEN : ImageView = itemView.findViewById(R.id.image)
        val marca : TextView = itemView.findViewById(R.id.marca)
        val pais : TextView = itemView.findViewById(R.id.pais)
        val numero : TextView = itemView.findViewById(R.id.numero)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPrize.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(
            layoutInflater
                .inflate(R.layout.fragment_stadiums
                    ,parent
                    ,false)

        )
    }

    override fun onBindViewHolder(holder: AdapterPrize.ViewHolder, position: Int) {
        val itemsong = lstGEN[position]
        holder.imgGEN.setImageResource(itemsong.image)
        holder.marca.text = itemsong.Marca
        holder.pais.text =  itemsong.Pais
        holder.numero.text =  itemsong.numero


    }

    override fun getItemCount(): Int {
        return lstGEN.size
    }

}
