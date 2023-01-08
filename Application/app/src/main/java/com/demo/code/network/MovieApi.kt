package com.demo.code.network

import com.demo.code.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

  companion object {
    private const val MOVIES = "movies.json"
  }

  @GET(MOVIES)
  fun movies(): Call<List<Movie>>

}