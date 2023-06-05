package com.example.androidpracticeapp.uiState

import androidx.compose.runtime.Immutable

data class MainScreenUiState(
    val selectedType: BottomTabType,
    val listener: Listener,
) {

    @Immutable
    interface Listener {
        fun onClickCompose()
        fun onClickView()
    }

    enum class BottomTabType {
        Compose,
        View,
    }
}