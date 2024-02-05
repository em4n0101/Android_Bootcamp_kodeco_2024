package com.alexbar.androidbootcampkodeco2024.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexbar.androidbootcampkodeco2024.R
import com.alexbar.androidbootcampkodeco2024.ui.theme.AndroidBootcampKodeco2024Theme
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.dimen_300_dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.dimen_36_dp
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.percent_default_value
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.size_18
import com.alexbar.androidbootcampkodeco2024.ui.theme.Dimens.size_300


@Composable
fun Map(
    xPercent: Float,
    yPercent: Float,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(dimen_300_dp)
            .background(Color.Blue)
    ) {
        val image: Painter = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .offset(
                    (xPercent * size_300 - size_18).dp,
                    (yPercent * size_300 - size_18).dp
                )
                .size(dimen_36_dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MapPreview() {
    AndroidBootcampKodeco2024Theme {
        Map(
            xPercent = percent_default_value,
            yPercent = percent_default_value
        )
    }
}