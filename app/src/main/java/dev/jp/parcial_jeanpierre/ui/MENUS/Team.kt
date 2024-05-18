package dev.jp.parcial_jeanpierre.ui.MENUS

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import dev.jp.parcial_jeanpierre.R
import dev.jp.parcial_jeanpierre.databinding.FragmentPrizeBinding
import dev.jp.parcial_jeanpierre.databinding.FragmentTeamBinding

class Team : Fragment() {

    private var _binding: FragmentTeamBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTeamBinding.inflate(inflater, container, false)
        val root: View = binding.root
        var arrSO = arrayOf("Arg", "Bra", "Uru",
            "Colo", "Estados", "Peru", "Trinidad")
       val lsvSistemasOperativos: ListView = binding.lvTeams
        //val adaptador: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)

        //lsvSistemasOperativos.adapter = adaptador as ListAdapter?

       // lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(applicationContext, "posicion: $position ", Toast.LENGTH_LONG).show()
        //}

        return root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}