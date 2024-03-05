package com.alexbar.androidbootcampkodeco2024.week5.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class CountryName(
    val common: String
) : Parcelable