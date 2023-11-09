package com.example.myfirstmvi

data class MainState(val data: Int) : UiState {
    companion object {
        fun init() = MainState(0)
    }
}
