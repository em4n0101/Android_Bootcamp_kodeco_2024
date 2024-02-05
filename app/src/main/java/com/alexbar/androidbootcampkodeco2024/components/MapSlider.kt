package com.alexbar.androidbootcampkodeco2024.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.dimen_4_dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.dimen_8_dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.percent_default_value
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.value_range_end
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.value_range_start

@Composable
fun MapSlider(
    modifier: Modifier = Modifier,
    value: Float = percent_default_value,
    valueChanged: (Float) -> Unit
) {
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

@Preview
@Composable
fun MapSliderPreview() {
    Slider(
        value = percent_default_value,
        onValueChange = {}
    )
}