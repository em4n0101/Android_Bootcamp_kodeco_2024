package com.alexbar.androidbootcampkodeco2024.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens

@Composable
fun MapSliderLandscape(
    modifier: Modifier = Modifier,
    value: Float = Dimens.percent_default_value,
    title: String,
    valueChanged: (Float) -> Unit
) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = Dimens.dimen_16_dp)
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(start = Dimens.dimen_8_dp)
                .width(120.dp)
                .align(Alignment.CenterHorizontally),
        )
        Slider(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = Dimens.dimen_8_dp,
                    vertical = Dimens.dimen_4_dp
                ),
            value = value,
            valueRange = Dimens.value_range_start..Dimens.value_range_end,
            onValueChange = valueChanged
        )
    }
}

@Preview
@Composable
fun MapSliderLandscapePreview() {
    MapSliderLandscape(
        value = Dimens.percent_default_value,
        title = "X value: 30%",
        valueChanged = {}
    )
}