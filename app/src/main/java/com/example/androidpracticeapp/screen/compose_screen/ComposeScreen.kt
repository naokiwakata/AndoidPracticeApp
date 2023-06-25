package com.example.androidpracticeapp.screen.compose_screen

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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposeScreen(
    modifier: Modifier,
    uiState: ComposeScreenUiState
) {
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        println("ComposeScreen:LaunchedEffect")
    }
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
                    //uiState.listener.onClickNewCompose()
                }
            ) {
                Text(text = "Composeの画面遷移")
            }
            ElevatedButton(
                onClick = {
                    val intent = ComposeNewActivity.createIntent(context)
                    context.startActivity(intent)
                    //uiState.listener.onClickNewActivity()
                }
            ) {
                Text(text = "新たなActivityを開く")
            }
        }
    }
}
