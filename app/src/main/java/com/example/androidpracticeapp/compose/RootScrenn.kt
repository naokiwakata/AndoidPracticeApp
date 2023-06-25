package com.example.androidpracticeapp.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.androidpracticeapp.uiState.MainScreenUiState

@Composable
fun RootScreen(
    mainScreenUiState: MainScreenUiState,
) {
    BottomNavigationScreen(mainScreenUiState = mainScreenUiState)
}