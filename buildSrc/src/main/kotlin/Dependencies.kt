/**
 * Utilizar implementation.
 * Ex.: implementation DependenciesTest.androidCore
 */
object Dependencies {

    const val androidCore = "androidx.core:core-ktx:${Version.androidCoreVersion}"
    const val androidAppCompat = "androidx.appcompat:appcompat:${Version.androidAppCompat}"
    const val material = "com.google.android.material:material:${Version.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val activityKtx = "androidx.activity:activity-ktx:${Version.activityKtx}"
    //Lifecycle - ViewModel
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:${Version.lifecycle}"
    //Koin
    const val koinAndroid = "io.insert-koin:koin-android:${Version.koinAndroid}"
    const val koinCore = "io.insert-koin:koin-core:${Version.koinAndroid}"
    //Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    const val gson = "com.google.code.gson:gson:${Version.gson}"
    //Android Room
    const val room = "androidx.room:room-ktx:${Version.room}"
    const val roomRxJava = "androidx.room:room-rxjava2:${Version.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.room}"
    //Mockk
    const val mockkAndroid = "io.mockk:mockk-android:${Version.mockkVersion}"
    //Retrofit
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Version.rxJava}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Version.rxKotlin}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Version.rxAndroid}"

    /**
     * Utilizar testImplementation.
     * Ex.: testImplementation DependenciesTest.junit
     */
    const val androidTestCore = "androidx.test:core-ktx:${Version.androidTestCore}"
    const val androidArchTes = "androidx.arch.core:core-testing:${Version.androidArchTes}"
    const val junit = "junit:junit:${Version.junit}"
    const val koinTest = "io.insert-koin:koin-test:${Version.koinAndroid}"
    const val mockk = "io.mockk:mockk:${Version.mockkVersion}"

    /**
     * Utilizar androidTestImplementation.
     * Ex.: androidTestImplementation DependenciesTest.testExt
     */
    //AndroidTest
    const val testExt = "androidx.test.ext:junit:${Version.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.expressoCore}"
    //Android Room
    const val roomTest = "androidx.room:room-testing:${Version.room}"
    const val runner = "androidx.test:runner:"

}