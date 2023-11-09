package com.example.myfirstmvi

class MainReducer(state: MainState) : Reducer<MainState, MainEvent>(state) {
    override fun reduce(oldState: MainState, event: MainEvent) {
        when (event) {
            is MainEvent.Increase -> {
                setState(oldState.copy(data = oldState.data + 1))
            }

            is MainEvent.Decrease -> {
                setState(oldState.copy(data =  oldState.data - 1))
            }
        }
    }
}