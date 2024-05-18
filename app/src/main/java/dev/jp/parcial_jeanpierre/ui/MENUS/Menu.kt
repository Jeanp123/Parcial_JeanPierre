package dev.jp.parcial_jeanpierre.ui.MENUS

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dev.jp.parcial_jeanpierre.R
import dev.jp.parcial_jeanpierre.databinding.FragmentMenuBinding

class Menu : Fragment() {

    private var _binding: FragmentMenuBinding? = null
        // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val nav = findNavController()

        binding.btnPrize.setOnClickListener {
            nav.navigate(R.id.navigation_Prize)
        }
        binding.btnTeam.setOnClickListener { nav.navigate(R.id.navigation_Teams) }
        binding.btnStadiu.setOnClickListener {  nav.navigate(R.id.navigation_Stadiums)}

        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}