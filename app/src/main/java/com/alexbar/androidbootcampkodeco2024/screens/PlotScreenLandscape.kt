package com.alexbar.androidbootcampkodeco2024.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.alexbar.androidbootcampkodeco2024.R
import com.alexbar.androidbootcampkodeco2024.components.Map
import com.alexbar.androidbootcampkodeco2024.components.MapSliderLandscape
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens
import kotlin.math.roundToInt

@Composable
fun PlotScreenLandscape(
    xPercent: Float,
    yPercent: Float,
    onXPercentChange: (Float) -> Unit,
    onYPercentChange: (Float) -> Unit
) {
    Row {
        Map(
            xPercent = xPercent,
            yPercent = yPercent,
            modifier = Modifier.padding(Dimens.dimen_16_dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(Dimens.dimen_16_dp)
        ) {
            MapSliderLandscape(
                value = xPercent,
                title = stringResource(R.string.x_axis_title, (xPercent * 100).roundToInt()),
                valueChanged = onXPercentChange
            )
            MapSliderLandscape(
                value = yPercent,
                title = stringResource(R.string.y_axis_title, (yPercent * 100).roundToInt()),
                valueChanged = onYPercentChange
            )
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 480,
    heightDp = 320
)
@Composable
fun PlotScreenLandscapePreview() {
    PlotScreenLandscape(xPercent = 0.4f, yPercent = 0.6f, {}, {})
}