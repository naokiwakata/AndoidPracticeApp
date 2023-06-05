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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            when (mainScreenUiState.selectedType) {
                MainScreenUiState.BottomTabType.Compose -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "This is Compose Screen!!")
                    }
                }

                MainScreenUiState.BottomTabType.View -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "This is View Screen!!")
                    }
                }
            }
        }
        MainActivityBottomNavigation(
            onClickCompose = { mainScreenUiState.listener.onClickCompose() },
            onClickView = { mainScreenUiState.listener.onClickView() },
        )
    }
}