package com.example.androidpracticeapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidpracticeapp.compose.RootScreen
import com.example.androidpracticeapp.viewModel.MainScreenViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Androidのウィンドウのデコレーションがシステムウィンドウに合わせて自動的に調整されないように設定する
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContent {
            val mainScreenViewModel = viewModel(
                initializer = {
                    MainScreenViewModel()
                }
            )
            RootScreen(
                mainScreenUiState = mainScreenViewModel.uiStateFlow.collectAsState().value
            )
        }
    }
}