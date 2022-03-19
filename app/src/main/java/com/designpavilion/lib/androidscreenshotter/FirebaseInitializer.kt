package com.designpavilion.lib.androidscreenshotter

import android.content.Context
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions


class FirebaseInitializer {

    private val config: FirebaseConfig = FirebaseConfig()

    fun init(context: Context) {
        FirebaseApp.initializeApp(
            context, FirebaseOptions.Builder()
                .setApplicationId(config.getAppId())
                .setApiKey(config.getApiKey())
                .setGcmSenderId(config.getProjectNumber())
                .setStorageBucket(config.getStorageBucket())
                .setProjectId(config.getProjectId())
                .build()
        )
    }

}