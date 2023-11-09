package com.example.myfirstmvi

sealed class MainEvent : UiEvent {
    object Increase : MainEvent()
    object Decrease : MainEvent()
}
