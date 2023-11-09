package com.example.myfirstmvi

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class Reducer<S : UiState, E : UiEvent>(initialState: S) {
    private val _uiState = MutableStateFlow(initialState)
    val uiState get() = _uiState.asStateFlow()

    fun sendEvent(event: E) {
        reduce(_uiState.value, event)
    }

    fun setState(newState: S) {
        _uiState.value = newState
    }

    abstract fun reduce(oldState: S, event: E)
}

interface UiState

interface UiEvent