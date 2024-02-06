package com.alexbar.androidbootcampkodeco2024.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import com.alexbar.androidbootcampkodeco2024.ui.theme.AndroidBootcampKodeco2024Theme
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens


@Composable
fun PlotScreen() {
    var xPercent: Float by remember { mutableFloatStateOf(Dimens.percent_default_value) }
    var yPercent: Float by remember { mutableFloatStateOf(Dimens.percent_default_value) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        val configuration = LocalConfiguration.current
        if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            PlotScreenPortrait(
                xPercent = xPercent,
                yPercent = yPercent,
                onXPercentChange = { xPercent = it },
                onYPercentChange = { yPercent = it }
            )
        } else if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            PlotScreenLandscape(
                xPercent = xPercent,
                yPercent = yPercent,
                onXPercentChange = { xPercent = it },
                onYPercentChange = { yPercent = it }
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PlotSurfacePreview() {
    AndroidBootcampKodeco2024Theme {
        PlotScreen()
    }
}
