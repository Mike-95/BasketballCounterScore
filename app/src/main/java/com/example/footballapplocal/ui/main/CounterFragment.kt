package com.example.footballapplocal.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.footballapplocal.R
import com.example.footballapplocal.databinding.FragmentCounterBinding

const val THREE_POINTS = 3

class CounterFragment : Fragment() {

    private lateinit var binding: FragmentCounterBinding
    var points = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = FragmentCounterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.btnThreePoints.setOnClickListener {
           points+=3
           binding.tvTeamAPoints.text = points.toString()

       }

        }


    }



