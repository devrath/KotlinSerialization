package com.demo.code.model

import com.google.gson.annotations.SerializedName

data class MovieModel(
    @SerializedName("title")
    val title: String,
    @SerializedName("id")
    val id: Long,
    @SerializedName("poster_path")
    val posterPath: String
)