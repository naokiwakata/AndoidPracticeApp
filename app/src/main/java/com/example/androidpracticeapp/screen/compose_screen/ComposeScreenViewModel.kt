package com.example.androidpracticeapp.screen.compose_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidpracticeapp.screen.main.MainScreenUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ComposeScreenViewModel : ViewModel() {

    private val listener = object : ComposeScreenUiState.Listener {
        override fun onClickNewActivity() {

        }

        override fun onClickNewCompose() {
            TODO("Not yet implemented")
        }
    }

    val uiStateFlow: MutableStateFlow<ComposeScreenUiState> = MutableStateFlow(
        ComposeScreenUiState(
            listener = listener,
        )
    ).also { mutableStateFlow ->
        viewModelScope.launch {
            mutableStateFlow.update {
                it.copy(
                    listener = listener,
                )
            }
        }
    }

    interface ViewModelEvent {
        fun navigateToNewActivity()
        fun navigateToNewCompose()
    }
}