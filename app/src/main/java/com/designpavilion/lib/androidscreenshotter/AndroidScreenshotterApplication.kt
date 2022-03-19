package com.designpavilion.lib.androidscreenshotter

import android.app.Application

class AndroidScreenshotterApplication:Application() {

    private val firebaseInitializer = FirebaseInitializer()

    override fun onCreate() {
        super.onCreate()
        firebaseInitializer.init(this.applicationContext)
    }

}