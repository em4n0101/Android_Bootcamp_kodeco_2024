package com.alexbar.androidbootcampkodeco2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.alexbar.androidbootcampkodeco2024.ui.theme.AndroidBootcampKodeco2024Theme
import com.alexbar.androidbootcampkodeco2024.week5.model.Country
import com.alexbar.androidbootcampkodeco2024.week5.networking.RetrofitInstance.countriesService
import com.alexbar.androidbootcampkodeco2024.week5.ui.components.CountryDetailScreen
import com.alexbar.androidbootcampkodeco2024.week5.ui.components.CountryErrorScreen
import com.alexbar.androidbootcampkodeco2024.week5.ui.components.CountryInfoScreen
import com.alexbar.androidbootcampkodeco2024.week5.ui.components.Loading
import kotlinx.coroutines.delay
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBootcampKodeco2024Theme {

                var countries by remember { mutableStateOf<List<Country>?>(null) }
                var isLoading by remember { mutableStateOf(false) }
                var errorMessage by remember { mutableStateOf<String?>(null) }
                var countrySelected by remember { mutableStateOf<Country?>(null) }

                LaunchedEffect(Unit) {
                    isLoading = true
                    delay(2000)
                    val response: Response<List<Country>> = countriesService.getAllCountries()
                    if (response.isSuccessful) {
                        countries = response.body()
                    } else {
                        errorMessage = response.message()
                    }
                    isLoading = false
                }

                Box(modifier = Modifier.fillMaxSize()) {
                    when {
                        isLoading -> {
                            Loading(isDisplayed = isLoading)
                        }
                        errorMessage != null -> {
                            CountryErrorScreen(errorMessage = errorMessage!!) {
                                errorMessage = null
                            }
                        }
                        countrySelected != null -> {
                            CountryDetailScreen(country = countrySelected!!) {
                                countrySelected = null
                            }
                        }
                        countries != null -> {
                            CountryInfoScreen(countries ?: emptyList()) {
                                countrySelected = it
                            }
                        }
                    }
                }
            }
        }
    }
}

/*
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
                valueChanged = { value ->
                    xPercent = value
                }
            )
            MapSlider(
                value = yPercent,
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
*/