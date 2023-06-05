package com.example.androidpracticeapp.compose

import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.androidpracticeapp.R

@Composable
fun MainActivityBottomNavigation(
    onClickCompose: () -> Unit,
    onClickView: () -> Unit,
) {
    androidx.compose.material.BottomNavigation(
        backgroundColor = Color.White,
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { onClickCompose() },
            label = {
                Text(text = "Compose")
            },
            icon = {
                painterResource(id = R.drawable.ic_launcher_foreground)
            },
        )
        NavigationBarItem(
            selected = true,
            onClick = { onClickView() },
            label = {
                Text(text = "View")
            },
            icon = {
                painterResource(id = R.drawable.ic_launcher_background)
            },
        )
    }
}
