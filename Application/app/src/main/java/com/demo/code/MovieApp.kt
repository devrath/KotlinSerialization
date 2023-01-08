package com.demo.code

import android.app.Application
import com.demo.code.BuildConfig
import timber.log.Timber
import timber.log.Timber.DebugTree

class MovieApp: Application() {
  override fun onCreate() {
    super.onCreate()

    if (BuildConfig.DEBUG) {
      Timber.plant(DebugTree())
    }
  }
}
