package com.example.androidpracticeapp.screen.compose_screen

import androidx.compose.runtime.Immutable

data class ComposeScreenUiState(
    val listener: Listener,
) {

    @Immutable
    interface Listener {
        fun onClickNewCompose()
        fun onClickNewActivity()
    }
}