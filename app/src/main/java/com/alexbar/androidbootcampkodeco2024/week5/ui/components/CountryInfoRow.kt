package com.alexbar.androidbootcampkodeco2024.week5.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexbar.androidbootcampkodeco2024.week5.model.Country
import com.alexbar.androidbootcampkodeco2024.week5.model.CountryFlags
import com.alexbar.androidbootcampkodeco2024.week5.model.CountryName


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountryInfoRow(
    country: Country,
    onCountrySelected: (Country) -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .clickable {
                onCountrySelected(country)
            },
        onClick = { onCountrySelected(country) },
    ) {
        Column(        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Text(text = "Name: ${country.commonName}")
            Text(text = "Capital: ${country.capitalName}")
        }
    }
}

@Preview
@Composable
fun CountryInfoRowPreview() {
    CountryInfoRow(
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
