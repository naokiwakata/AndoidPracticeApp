package com.example.androidpracticeapp.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidpracticeapp.uiState.MainScreenUiState


@Composable
fun BottomNavigationScreen(
    mainScreenUiState: MainScreenUiState
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
            TabNavHost(modifier = Modifier.fillMaxSize(), mainScreenUiState = mainScreenUiState)
        }
        MainActivityBottomNavigation(
            onClickCompose = { mainScreenUiState.listener.onClickCompose() },
            onClickView = { mainScreenUiState.listener.onClickView() },
        )
    }
}

@Composable
private fun TabNavHost(modifier: Modifier, mainScreenUiState: MainScreenUiState) {
    val navController = rememberNavController()

    LaunchedEffect(mainScreenUiState.selectedType) {
        when (mainScreenUiState.selectedType) {
            MainScreenUiState.BottomTabType.Compose -> {
                navController.navigate(ScreenName.ComposeTab.navigationName) {
                    popUpTo(navController.graph.findStartDestination().id) {// 最初のスタック以外をpopする
                        saveState = true // popした画面の状態を保存
                    }
                    restoreState = true // saveStateで保存しておいた画面の状態を復元する
                    launchSingleTop = true // バックスタックに同じ画面がある場合はその画面を再利用する
                }
            }

            MainScreenUiState.BottomTabType.View -> {
                navController.navigate(ScreenName.ViewTab.navigationName) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    restoreState = true
                    launchSingleTop = true
                }
            }
        }
    }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = ScreenName.ComposeTab.navigationName,
    ) {
        composable(ScreenName.ComposeTab.navigationName) {
            ComposeScreen(modifier = Modifier.fillMaxSize())
        }
        composable(ScreenName.ViewTab.navigationName) {
            Text(text = "This is View Screen!!")
        }
    }
}

enum class ScreenName(val navigationName: String) {
    ComposeTab("/tab/compose"),
    ViewTab("/tab/view"),
}