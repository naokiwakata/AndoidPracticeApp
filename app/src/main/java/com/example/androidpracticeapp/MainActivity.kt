package com.example.androidpracticeapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidpracticeapp.screen.compose_screen.ComposeScreenViewModel
import com.example.androidpracticeapp.screen.main.AppTheme
import com.example.androidpracticeapp.screen.main.RootScreen
import com.example.androidpracticeapp.screen.main.MainScreenViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Androidのウィンドウのデコレーションがシステムウィンドウに合わせて自動的に調整されないように設定する
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContent {
            val mainScreenViewModel = viewModel(initializer = {
                MainScreenViewModel()
            })
            val composeScreenViewModel = viewModel(initializer = {
                ComposeScreenViewModel()
            })
            AppTheme {
                RootScreen(
                    mainScreenUiState = mainScreenViewModel.uiStateFlow.collectAsState().value,
                    composeScreenUiState = composeScreenViewModel.uiStateFlow.collectAsState().value,
                )
            }
        }
    }
}

