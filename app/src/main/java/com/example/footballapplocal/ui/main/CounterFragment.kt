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
    var pointsA = 0
    var pointsB = 0


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

        //3 points A
        binding.btnThreePoints.setOnClickListener {
            pointsA += 3
            binding.tvTeamAPoints.text = pointsA.toString()
        }

        //3 points B
        binding.btnThreePointsB.setOnClickListener {
            pointsB += 3
            binding.tvTeamBPoints.text = pointsB.toString()
        }

        //2 points A
        binding.btnTwoPoints.setOnClickListener {
            pointsA += 2
            binding.tvTeamAPoints.text = pointsA.toString()
        }

        //2 points B
        binding.btnTwoPointsB.setOnClickListener {
            pointsB += 2
            binding.tvTeamBPoints.text = pointsB.toString()
        }

        //Free Throw 1 point A
        binding.btnfreeThrow.setOnClickListener {
            pointsA += 1
            binding.tvTeamAPoints.text = pointsA.toString()
        }

        //Free Throw 1 point B
        binding.btnfreeThrowB.setOnClickListener {
            pointsB += 1
            binding.tvTeamBPoints.text = pointsB.toString()
        }

        binding.btnReset.setOnClickListener {
            pointsA = 0
            pointsB = 0
            binding.tvTeamAPoints.text = 0.toString()
            binding.tvTeamBPoints.text = 0.toString()
        }


    }


}



