package com.example.footballapplocal

 class MyViewModel : androidx.lifecycle.ViewModel() {

    private var _scoreTeamA= 0
    private var _scoreTeamB= 0


     fun addThreePointsA():Int{
         _scoreTeamA += 3
         return _scoreTeamA
     }
     fun addThreePointsB():Int{
         _scoreTeamB += 3
         return _scoreTeamB
     }

     fun addTwoPointsA():Int{
         _scoreTeamA += 2
         return _scoreTeamA
     }
     fun addTwoPointsB():Int{
         _scoreTeamB += 2
         return _scoreTeamB
     }

     fun addFreeThrowA():Int{
         _scoreTeamA += 1
         return _scoreTeamA
     }
     fun addFreeThrowB():Int{
         _scoreTeamB += 1
         return _scoreTeamB
     }

     fun resetPoints():Int{
         _scoreTeamA = 0
         _scoreTeamB = 0
         return _scoreTeamA
     }

     override fun onCleared() {
         super.onCleared()
     }

}