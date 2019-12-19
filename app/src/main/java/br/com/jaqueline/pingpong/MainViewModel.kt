package br.com.jaqueline.pingpong

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel  : ViewModel(){

    var homeScore = MutableLiveData<Int>()//.apply { 0 }
    var awayScore = MutableLiveData<Int>()//.apply { 0 }

    init {
        resetGame()
    }

    fun goalHome() {
        homeScore.value = homeScore.value?.plus(1)
    }

    fun goalAway() {
        awayScore.value = awayScore.value?.plus(1)
    }

    fun resetGame(){
        homeScore.value = 0
        awayScore.value = 0
    }
}