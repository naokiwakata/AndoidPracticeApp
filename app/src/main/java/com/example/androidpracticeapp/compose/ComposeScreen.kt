package com.example.androidpracticeapp.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposeScreen(modifier: Modifier) {
    val navController = rememberNavController()

    LaunchedEffect(Unit) {
        println("ComposeScreen:LaunchedEffect")
    }
    NavHost(navController = navController, startDestination = "first compose") {
        composable("first compose") {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = "Compose Screen") },
                    )
                },
            ) { paddingValues ->
                Column(
                    modifier = modifier
                        .padding(paddingValues)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(text = "This is Compose Screen!!")
                    ElevatedButton(
                        onClick = {
                            navController.navigate("second compose")
                        }
                    ) {
                        Text(text = "navigate second compose screen")
                    }
                }
            }
        }
        composable("second compose") {
            SecondComposeScreen(
                modifier = Modifier.fillMaxSize(),
                navController = navController,
            )
        }
    }
}