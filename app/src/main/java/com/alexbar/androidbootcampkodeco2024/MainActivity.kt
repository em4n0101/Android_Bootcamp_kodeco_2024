package com.alexbar.androidbootcampkodeco2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.alexbar.androidbootcampkodeco2024.components.Map
import com.alexbar.androidbootcampkodeco2024.components.MapSlider
import com.alexbar.androidbootcampkodeco2024.ui.theme.AndroidBootcampKodeco2024Theme
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.dimen_16_dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.percent_default_value
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBootcampKodeco2024Theme {
                PlotSurface()
            }
        }
    }
}

@Composable
fun PlotSurface() {
    var xPercent: Float by remember { mutableFloatStateOf(percent_default_value) }
    var yPercent: Float by remember { mutableFloatStateOf(percent_default_value) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(dimen_16_dp)
        ) {
            Map(
                xPercent = xPercent,
                yPercent = yPercent,
                modifier = Modifier.padding(bottom = dimen_16_dp)
            )
            MapSlider(
                value = xPercent,
                title = stringResource(R.string.x_axis_title, (xPercent * 100).roundToInt()),
                valueChanged = { value ->
                    xPercent = value
                }
            )
            MapSlider(
                value = yPercent,
                title = stringResource(R.string.y_axis_title, (yPercent * 100).roundToInt()),
                valueChanged = { value ->
                    yPercent = value
                }
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PlotSurfacePreview() {
    AndroidBootcampKodeco2024Theme {
        PlotSurface()
    }
}
