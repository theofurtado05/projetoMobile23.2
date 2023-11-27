package com.example.telainicial.Fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
//import com.example.myapplication.Meeting
import com.example.telainicial.R
//import com.example.telainicial.Reuniao

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NavBar.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavBar : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_frag, container, false)

        val btHoje = view.findViewById<ImageButton>(R.id.btHoje)
        val btVisualizacao = view.findViewById<ImageButton>(R.id.btVisualizacao)
        val btAdicionar = view.findViewById<ImageButton>(R.id.btAdd)
        val btBuscar = view.findViewById<ImageButton>(R.id.btBuscar)
        val btConfiguracoes = view.findViewById<ImageButton>(R.id.btConfig)

        btHoje.setOnClickListener {
            // Ao clicar em "Início", inicie a MainActivity
            //val intent = Intent(requireActivity(), Reuniao::class.java)
            //startActivity(intent)
        }

        btVisualizacao.setOnClickListener {
            //val intent = Intent(requireActivity(), Meeting::class.java)
            //startActivity(intent)
        }

        return view
    }
}
