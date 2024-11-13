plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

}


android {
    namespace = "com.example.wavesoffood"
    compileSdk = 34

    buildFeatures{
        viewBinding= true
    }
    lint {
        baseline = file("lint-baseline.xml")
    }

    defaultConfig {
        applicationId = "com.example.wavesoffood"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    dependencies {
        // Navigation Component for fragments
        implementation ("androidx.navigation:navigation-fragment-ktx:2.7.0")

        // Navigation UI for handling UI components like the bottom navigation, action bar
        implementation ("androidx.navigation:navigation-ui-ktx:2.7.0")
        implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")
        implementation ("com.squareup.picasso:picasso:2.71828")
    }

}