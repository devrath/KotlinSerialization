package com.demo.code.network

import android.content.Context
import com.demo.code.interceptors.AnalyticsInterceptor
import com.demo.code.interceptors.ApiKeyInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.util.concurrent.TimeUnit

object OkHttpProvider {

  // Timeout for the network requests
  private const val REQUEST_TIMEOUT = 3L

  private var okHttpClient: OkHttpClient? = null

  fun getOkHttpClient(context: Context): OkHttpClient {
    return if (okHttpClient == null) {
      val loggingInterceptor = HttpLoggingInterceptor { message -> Timber.tag("OkHttp").d(message) }
      loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
      loggingInterceptor.redactHeader("x-amz-cf-id")

      val okHttpClient = OkHttpClient.Builder()
          .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
          .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
          .addInterceptor(ApiKeyInterceptor())
          .addInterceptor(AnalyticsInterceptor(context))
          .addInterceptor(loggingInterceptor)
          .build()
      OkHttpProvider.okHttpClient = okHttpClient
      okHttpClient
    } else {
      okHttpClient!!
    }
  }
}