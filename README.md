# How to setup native-lib.cpp file

- Replace necessary Firebase secrets in this snippet and copy to native-lib.cpp file
- Position native-lib.cpp in directory /src/main/kotlin/cpp (i.e. the file is referenced as /src/main/kotlin/cpp/native-lib.cpp)
- Read more here: https://medium.com/nerd-for-tech/secure-your-firebases-google-services-json-file-in-android-16680f8e5fb4 & https://mittalkartik1.medium.com/secret-management-in-android-c2a44f23fc59

NB: The native-lib.cpp MUST be gitignored as it should not be commited to Git - it contains your Firebase secrets

///////// SNIPPET STARTS //////////

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
  
///////// SNIPPET ENDS //////////
