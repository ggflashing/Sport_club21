plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.sport_club21"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sport_club21"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.recyclerview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Retrofit - Объект который приносит данные с Бэкендсервера и относит
    implementation (libs.retrofit)
//Gson  - Формат данных, и конвертер в Json приходящих данных с Бэкенд-сервера
implementation (libs.converter.gson)
    implementation(libs.gson)
    // Interceptor  Okttp - для логирования запросов и ответов // (правила сколько стучаться на сервер и ждать данные нашему Retrofit)
    implementation(libs.logging.interceptor)
    implementation (libs.okhttp)
    //Glide - передача  картинки с сервера и работа с ней:
    implementation (libs.glide)
    annotationProcessor (libs.compiler)
    //FireBase - для создания своей Бэк-Енд базы данных на FirebaseBase
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.analytics)
    //для анимации
    implementation (libs.lottie)
    //Delegates viewBinding
    // - один ViewBinding работает на все фрагменты, // умеет работать  в Не-главном потоке
    implementation (libs.viewbindingpropertydelegate)
    implementation (libs.viewbindingpropertydelegate.noreflection)
    //Room common RoomDataBase создает
    // базу локальных данных - внутри кэш-памяти // приложения конкретного пользователя
    implementation(libs.androidx.room.common)






}