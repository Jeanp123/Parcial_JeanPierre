package dev.jp.parcial_jeanpierre.ui.MENUS

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.jp.parcial_jeanpierre.LogInActivity
import dev.jp.parcial_jeanpierre.R
import dev.jp.parcial_jeanpierre.ui.Pmodelado.AdapterPrize
import dev.jp.parcial_jeanpierre.ui.Pmodelado.ModeloPrize

class Stadiums : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View =  inflater.inflate(R.layout.fragment_stadiums, container, false)
        val button: Button = view.findViewById(R.id.btnGoBack)
        val rvGen: RecyclerView = view.findViewById(R.id.recyclerView)

        rvGen.layoutManager = LinearLayoutManager(requireContext())
        rvGen.adapter = AdapterPrize(playList())

        button.setOnClickListener {
            val intent = Intent(requireContext(), LogInActivity::class.java)
            startActivity(intent)
        }

        return view


    }

    private fun playList(): List<ModeloPrize>{
        var lstSong: ArrayList<ModeloPrize> = ArrayList()

        lstSong.add(
            ModeloPrize(R.drawable.descarga
                ,"A.D.I.D.A.S"
                ,"Korn"
            ,"12121")
        )
        lstSong.add(
            ModeloPrize(R.drawable.descargas
                ,"Got the life"
                ,"Korn"
                ,"12121")
        )
        lstSong.add(
            ModeloPrize(R.drawable.descargasas
                ,"Freak on a leash"
                ,"Korn"
                ,"12121")
        )
        return lstSong
    }


}