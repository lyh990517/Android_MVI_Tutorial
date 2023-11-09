package com.example.myfirstmvi

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val reducer = MainReducer(MainState.init())

    val uiState get() = reducer.uiState

    private fun sendEvent(event: MainEvent) {
        reducer.sendEvent(event)
    }

    fun increase(){
        sendEvent(MainEvent.Increase)
    }

    fun decrease(){
        sendEvent(MainEvent.Decrease)
    }
}