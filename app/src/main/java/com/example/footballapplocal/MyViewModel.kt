package com.example.footballapplocal

import androidx.lifecycle.MutableLiveData

class MyViewModel : androidx.lifecycle.ViewModel() {

    var threePointsA = 0
    var threePointsB = 0



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
        threePointsA = 0
        threePointsB = 0
    }


    override fun onCleared() {
        super.onCleared()
    }

}