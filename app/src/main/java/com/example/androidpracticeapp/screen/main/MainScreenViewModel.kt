package com.example.androidpracticeapp.screen.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainScreenViewModel : ViewModel() {

    private val viewModelStateFlow = MutableStateFlow(ViewModelState())
    private val listener = object : MainScreenUiState.Listener {
        override fun onClickCompose() {
            viewModelStateFlow.update {
                it.copy(
                    selectedType = MainScreenUiState.BottomTabType.Compose
                )
            }
        }

        override fun onClickView() {
            viewModelStateFlow.update {
                it.copy(
                    selectedType = MainScreenUiState.BottomTabType.View
                )
            }
        }
    }

    val uiStateFlow: StateFlow<MainScreenUiState> = MutableStateFlow(
        MainScreenUiState(
            selectedType = MainScreenUiState.BottomTabType.Compose,
            listener = listener,
        )
    ).also { mutableStateFlow ->
        viewModelScope.launch {
            viewModelStateFlow.collect { viewModelState ->
                mutableStateFlow.update {
                    it.copy(
                        selectedType = viewModelState.selectedType
                    )
                }
            }
        }
    }


    data class ViewModelState(
        val selectedType: MainScreenUiState.BottomTabType = MainScreenUiState.BottomTabType.Compose,
    )
}