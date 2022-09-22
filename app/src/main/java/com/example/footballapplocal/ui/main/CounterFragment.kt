package com.example.footballapplocal.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.footballapplocal.MyViewModel
import com.example.footballapplocal.databinding.FragmentCounterBinding
import kotlin.math.log

const val THREE_POINTS = 3

class CounterFragment : Fragment() {

    private lateinit var binding: FragmentCounterBinding


    private val mViewModel: MyViewModel by viewModels()


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
            binding.tvTeamAPoints.text = mViewModel.addThreePointsA().toString()

        }

        //3 points B
        binding.btnThreePointsB.setOnClickListener {
            binding.tvTeamBPoints.text = mViewModel.addThreePointsB().toString()
        }

        //2 points A
        binding.btnTwoPoints.setOnClickListener {
            binding.tvTeamAPoints.text = mViewModel.addTwoPointsA().toString()
        }

        //2 points B
        binding.btnTwoPointsB.setOnClickListener {
            binding.tvTeamBPoints.text = mViewModel.addTwoPointsB().toString()
        }

        //Free Throw 1 point A
        binding.btnfreeThrow.setOnClickListener {
            binding.tvTeamAPoints.text = mViewModel.addFreeThrowA().toString()
        }

        //Free Throw 1 point B
        binding.btnfreeThrowB.setOnClickListener {
            binding.tvTeamBPoints.text = mViewModel.addFreeThrowB().toString()
        }

        binding.btnReset.setOnClickListener {
            binding.tvTeamAPoints.text = mViewModel.resetPoints().toString()
            binding.tvTeamBPoints.text = mViewModel.resetPoints().toString()
        }


    }


}



