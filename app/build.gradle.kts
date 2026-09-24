plugins {
    id("com.android.application")
}
android {
    namespace = "com.googletv.kumanda"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.googletv.kumanda"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
}
