package com.designpavilion.lib.androidscreenshotter

class FirebaseConfig {

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }

    external fun getAppId(): String
    external fun getApiKey(): String
    external fun getProjectId(): String
    external fun getProjectNumber(): String
    external fun getStorageBucket(): String

}