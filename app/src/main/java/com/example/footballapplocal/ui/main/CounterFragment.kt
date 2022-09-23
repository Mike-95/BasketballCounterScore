package com.example.footballapplocal.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.footballapplocal.MyViewModel
import com.example.footballapplocal.databinding.FragmentCounterBinding
import kotlin.math.log

const val THREE_POINTS = 3

class CounterFragment : Fragment() {

    private lateinit var binding: FragmentCounterBinding


    lateinit var mViewModel: MyViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCounterBinding.inflate(inflater, container, false)

        mViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        //observe currentNumberAThreePoints
        mViewModel.currentNumberAThreePoints.observe(viewLifecycleOwner, Observer {
            binding.tvTeamAPoints.text = it.toString()
        })
        //observe currentNumberBThreePoints
        mViewModel.currentNumberBThreePoints.observe(viewLifecycleOwner, Observer {
            binding.tvTeamBPoints.text = it.toString()
        })
        //observe currentNumberATwoPoints
        mViewModel.currentNumberATwoPoints.observe(viewLifecycleOwner, Observer {
            binding.tvTeamAPoints.text = it.toString()
        })
        //observe currentNumberBTwoPoints
        mViewModel.currentNumberBTwoPoints.observe(viewLifecycleOwner, Observer {
            binding.tvTeamBPoints.text = it.toString()
        })
        //observe currentNumberAOnePoint
        mViewModel.currentNumberAOnePoint.observe(viewLifecycleOwner, Observer {
            binding.tvTeamAPoints.text = it.toString()
        })
        //observe currentNumberBOnePoint
        mViewModel.currentNumberBOnePoint.observe(viewLifecycleOwner, Observer {
            binding.tvTeamBPoints.text = it.toString()
        })
        mViewModel.resetAllPoints().toString()

        incrementPoints()
        return binding.root

    }

    private fun incrementPoints() {
        binding.apply {
            btnThreePoints.setOnClickListener {
                mViewModel.currentNumberAThreePoints.value = ++mViewModel.threePointsA
            }
            btnThreePointsB.setOnClickListener {
                mViewModel.currentNumberBThreePoints.value = ++mViewModel.threePointsB
            }
            btnTwoPoints.setOnClickListener {
                mViewModel.currentNumberATwoPoints.value = ++mViewModel.threePointsA
            }
            btnTwoPointsB.setOnClickListener {
                mViewModel.currentNumberBTwoPoints.value = ++mViewModel.threePointsB
            }
            btnfreeThrow.setOnClickListener {
                mViewModel.currentNumberAOnePoint.value = ++mViewModel.threePointsA
            }
            btnfreeThrowB.setOnClickListener {
                mViewModel.currentNumberBOnePoint.value = ++mViewModel.threePointsB
            }
            btnReset.setOnClickListener {
                mViewModel.resetAllPoints()
            }
        }

    }



}



