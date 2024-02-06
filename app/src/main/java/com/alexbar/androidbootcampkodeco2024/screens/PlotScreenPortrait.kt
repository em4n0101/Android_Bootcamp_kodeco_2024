package com.alexbar.androidbootcampkodeco2024.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.alexbar.androidbootcampkodeco2024.R
import com.alexbar.androidbootcampkodeco2024.components.Map
import com.alexbar.androidbootcampkodeco2024.components.MapSlider
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens
import kotlin.math.roundToInt

@Composable
fun PlotScreenPortrait(
    xPercent: Float,
    yPercent: Float,
    onXPercentChange: (Float) -> Unit,
    onYPercentChange: (Float) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens.dimen_16_dp)
    ) {
        Map(
            xPercent = xPercent,
            yPercent = yPercent,
            modifier = Modifier.padding(bottom = Dimens.dimen_16_dp)
        )
        MapSlider(
            value = xPercent,
            title = stringResource(R.string.x_axis_title, (xPercent * 100).roundToInt()),
            valueChanged = onXPercentChange
        )
        MapSlider(
            value = yPercent,
            title = stringResource(R.string.y_axis_title, (yPercent * 100).roundToInt()),
            valueChanged = onYPercentChange
        )
    }
}