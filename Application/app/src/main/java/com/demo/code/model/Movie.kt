package com.demo.code.model

import kotlinx.serialization.Serializable

@Serializable
data class Movie(val id: Int, val poster: String)