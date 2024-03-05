package com.alexbar.androidbootcampkodeco2024.week5.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun Loading(isDisplayed: Boolean) {
    if (isDisplayed) {
        Dialog(onDismissRequest = { }) {
            Surface(
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier.padding(all = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Loading...")
                }
            }
        }
    }
}

@Preview
@Composable
fun LoadingPreview() {
    Loading(false)
}
