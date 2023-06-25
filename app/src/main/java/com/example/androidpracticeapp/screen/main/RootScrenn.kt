package com.example.androidpracticeapp.screen.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidpracticeapp.screen.compose_screen.ComposeScreenUiState
import com.example.androidpracticeapp.screen.compose_screen.SecondComposeScreen

@Composable
fun RootScreen(
    mainScreenUiState: MainScreenUiState,
    composeScreenUiState: ComposeScreenUiState,
) {
    val rootNavController = rememberNavController()

    NavHost(
        navController = rootNavController,
        startDestination = ScreenNames.Root.navigationName,
    ) {
        composable(ScreenNames.Root.navigationName) {
            BottomNavigationScreen(
                modifier = Modifier.fillMaxSize(),
                mainScreenUiState = mainScreenUiState,
                composeScreenUiState = composeScreenUiState,
            )
        }
//        ScreenNames.values().forEach { screenName ->
//            when (screenName) {
//                ScreenNames.Root -> {
//                    composable(ScreenNames.Root.navigationName) {
//                        BottomNavigationScreen(
//                            modifier = Modifier.fillMaxSize(),
//                            mainScreenUiState = mainScreenUiState
//                        )
//                    }
//                }
//
//                ScreenNames.ComposeSecondScreen -> {
//                    composable(ScreenNames.Root.navigationName) {
//                        SecondComposeScreen(modifier = Modifier.fillMaxSize())
//                    }
//                }
//            }
//        }
    }
}

enum class ScreenNames(val navigationName: String) {
    Root("/"),
    ComposeSecondScreen("/compose-second-screen"),
}