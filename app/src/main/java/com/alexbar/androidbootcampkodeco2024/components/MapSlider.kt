package com.alexbar.androidbootcampkodeco2024.components

import androidx.compose.foundation.layout.Row
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
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.dimen_4_dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.dimen_8_dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.percent_default_value
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.value_range_end
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.value_range_start

@Composable
fun MapSlider(
    modifier: Modifier = Modifier,
    value: Float = percent_default_value,
    title: String,
    valueChanged: (Float) -> Unit
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(start = 8.dp)
                .width(120.dp)
                .align(Alignment.CenterVertically),
        )
        Slider(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = dimen_8_dp,
                    vertical = dimen_4_dp
                ),
            value = value,
            valueRange = value_range_start..value_range_end,
            onValueChange = valueChanged
        )
    }
}

@Preview
@Composable
fun MapSliderPreview() {
    MapSlider(
        value = percent_default_value,
        title = "X value: 30%",
        valueChanged = {}
    )
}