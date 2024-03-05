package com.alexbar.androidbootcampkodeco2024.week5.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.alexbar.androidbootcampkodeco2024.ui.theme.Typography
import com.alexbar.androidbootcampkodeco2024.week5.model.Country
import com.alexbar.androidbootcampkodeco2024.week5.model.CountryFlags
import com.alexbar.androidbootcampkodeco2024.week5.model.CountryName

@Composable
fun CountryDetailScreen(
    country: Country,
    onBackSelected: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        Row {
            IconButton(onClick = { onBackSelected() }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = null
                )
            }
            Text(text = country.commonName, style = Typography.titleLarge)
        }
        Text(text = "Capital: ${country.capitalName}")
        Text(text = "Population: ${country.population}")
        Text(text = "Area: ${country.area}")
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(country.flagImage)
                .crossfade(true)
                .build(),
            contentDescription = "",
        )
    }
}

@Preview
@Composable
fun CountryDetailScreenPreview() {
    CountryDetailScreen(
        Country(
            CountryName(
                "Mexico"
            ),
            listOf("Mexico"),
            555555,
            1111.111,
            CountryFlags(
                ""
            )
        )
    ) {}
}
