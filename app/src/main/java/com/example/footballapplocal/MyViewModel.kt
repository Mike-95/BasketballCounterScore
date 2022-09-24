package com.example.footballapplocal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

const val THREE_POINTS = 3
class MyViewModel : androidx.lifecycle.ViewModel() {

    var threePointsAA = 0
    var threePointsBB = 0

    private val _threePointsA = MutableLiveData(0)
    val threePointsA: LiveData<Int>
    get() = _threePointsA

    private val _threePointsB = MutableLiveData(0)
    val threePointsB: LiveData<Int>
    get() = _threePointsB


     fun increasePoints(){
        _threePointsA.value = (_threePointsA.value)?.plus(THREE_POINTS)
    }



    val currentNumberAThreePoints: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val currentNumberBThreePoints: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val currentNumberATwoPoints: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val currentNumberBTwoPoints: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val currentNumberAOnePoint: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val currentNumberBOnePoint: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun resetAllPoints(){
        threePointsAA = 0
        threePointsBB = 0
    }


    override fun onCleared() {
        super.onCleared()
    }

}