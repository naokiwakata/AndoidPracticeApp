package com.example.androidpracticeapp.screen.compose_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondComposeScreen(
    modifier: Modifier,
) {
    LaunchedEffect(Unit) {
        println("ComposeScreen:LaunchedEffect")
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Second Compose Screen") },
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = com.google.android.material.R.drawable.mtrl_ic_arrow_drop_up),
                        contentDescription = "back"
                    )
                },
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
            Text(text = "This is Second Compose Screen!!")
            ElevatedButton(
                onClick = {
                }
            ) {
                Text(text = "戻る")
            }
        }
    }
}