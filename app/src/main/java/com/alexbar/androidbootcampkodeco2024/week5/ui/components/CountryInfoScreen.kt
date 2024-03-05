package com.alexbar.androidbootcampkodeco2024.week5.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.alexbar.androidbootcampkodeco2024.week5.model.Country

@Composable
fun CountryInfoScreen(
    countries: List<Country>,
    onCountrySelected: (Country) -> Unit
) {
    LazyColumn {
        items(countries) { country ->
            CountryInfoRow(country = country, onCountrySelected = onCountrySelected)
        }
    }
}
