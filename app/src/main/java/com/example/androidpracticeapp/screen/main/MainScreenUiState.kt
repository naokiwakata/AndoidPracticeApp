package com.example.androidpracticeapp.screen.main

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