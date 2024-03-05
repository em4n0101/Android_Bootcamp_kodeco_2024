package com.alexbar.androidbootcampkodeco2024.week5.networking

import com.alexbar.androidbootcampkodeco2024.week5.model.Country
import retrofit2.Response
import retrofit2.http.GET

interface ServiceInterface {
    @GET("all")
    suspend fun getAllCountries(): Response<List<Country>>
}