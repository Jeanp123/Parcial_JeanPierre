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
import dev.jp.parcial_jeanpierre.databinding.FragmentPrizeBinding

class Prize : Fragment() {

    private var _binding: FragmentPrizeBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPrizeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val nav = findNavController()

        binding.btnCalculate.setOnClickListener {
            val monto1 = calcprimero(binding.txtprecio.text.toString().toDouble())
            val monto2 =  calcsegundo(binding.txtprecio.text.toString().toDouble())
            val monto3 =  calctercero(binding.txtprecio.text.toString().toDouble())
            val sumamonto = monto1 + monto2 + monto3
            val monto4 =  calccuarto(binding.txtprecio.text.toString().toDouble(),sumamonto)
            binding.tv1P.text = monto1.toString()
            binding.tv1P.text = monto2.toString()
            binding.tv1P.text = monto3.toString()
            binding.tv1P.text = monto4.toString()

        }

        binding.btnGoBack.setOnClickListener {
            val intent = Intent(requireContext(),Menu::class.java)
            startActivity(intent)
        }
        return root

    }
    private fun calcprimero(precio:Double):Double{
        return precio * 0.25
    }
    private fun calcsegundo(precio:Double):Double{
        return precio * 0.15
    }
    private fun calctercero(precio:Double):Double{
        return precio * 0.10
    }
    private fun calccuarto(precio:Double, suma:Double):Double{
        return precio * ((suma)/13)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}