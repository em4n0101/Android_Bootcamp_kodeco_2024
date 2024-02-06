package com.alexbar.androidbootcampkodeco2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.alexbar.androidbootcampkodeco2024.screens.PlotScreen
import com.alexbar.androidbootcampkodeco2024.ui.theme.AndroidBootcampKodeco2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContent {
            AndroidBootcampKodeco2024Theme {
                PlotScreen()
            }
        }
    }
}
