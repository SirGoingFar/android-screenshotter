# android-screenshotter


### ---- native-lib.cpp looks like this ------
- Replace necessary Firebase secrets in this snippet
- Position native-lib.cpp inside
- Read more here: https://medium.com/nerd-for-tech/secure-your-firebases-google-services-json-file-in-android-16680f8e5fb4 & https://mittalkartik1.medium.com/secret-management-in-android-c2a44f23fc59

///////// START //////////

#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL Java_com_designpavilion_lib_androidscreenshotter_FirebaseConfig_getAppId(JNIEnv *env, jobject object) {
    std::string value = "YOUR_FIREBASE_MOBILESDK_APP_ID";
    return env->NewStringUTF(value.c_str());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_designpavilion_lib_androidscreenshotter_FirebaseConfig_getApiKey(JNIEnv *env, jobject object) {
    std::string value = "YOUR_FIREBASE_CURRENT_KEY";
    return env->NewStringUTF(value.c_str());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_designpavilion_lib_androidscreenshotter_FirebaseConfig_getProjectId(JNIEnv *env, jobject object) {
    std::string value = "YOUR_FIREBASE_PROJECT_ID";
    return env->NewStringUTF(value.c_str());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_designpavilion_lib_androidscreenshotter_FirebaseConfig_getProjectNumber(JNIEnv *env, jobject object) {
    std::string value = "YOUR_FIREBASE_PROJECT_NUMBER";
    return env->NewStringUTF(value.c_str());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_designpavilion_lib_androidscreenshotter_FirebaseConfig_getStorageBucket(JNIEnv *env, jobject object) {
    std::string value = "YOUR_FIREBASE_STORAGE_BUCKET";
    return env->NewStringUTF(value.c_str());
}
  
///////// END //////////
