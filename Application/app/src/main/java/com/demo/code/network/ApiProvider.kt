package com.demo.code.network

import android.content.Context
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiProvider {

  const val API_BASE_URL = "https://raw.githubusercontent.com/devrath/Sample-Data/master/Android-CleanArchitecture-Kotlin/"

  private var movieApi: MovieApi? = null

  fun getMovieApi(context: Context): MovieApi {
    if (movieApi == null) {
      movieApi = Retrofit.Builder()
          .baseUrl(API_BASE_URL)
          .addConverterFactory(GsonConverterFactory.create(Gson()))
          .client(OkHttpProvider.getOkHttpClient(context))
          .build()
          .create(MovieApi::class.java)
    }
    return movieApi!!
  }
}