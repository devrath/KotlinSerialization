package com.demo.code.model

import com.demo.code.model.MovieModel
import com.google.gson.annotations.SerializedName

data class MovieApiResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieModel>
)