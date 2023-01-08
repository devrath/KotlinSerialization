package com.demo.code.model

import com.google.gson.annotations.SerializedName

data class MovieDetailsModel(
    @SerializedName("title")
    val title: String,
    @SerializedName("tagline")
    val tagline: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("runtime")
    val runtime: Int
)