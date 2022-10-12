object Version {

    const val androidCoreVersion = "1.9.0"
    const val androidAppCompat = "1.5.1"
    const val material = "1.6.1"
    const val constraintLayout = "2.1.4"
    const val koinAndroid = "3.2.2"

    //Test
    const val junit = "4.13.2"

    //Android Test
    const val junitExt = "1.1.3"
    const val expressoCore = "3.4.0"

}

/**
 * Utilizar implementation.
 * Ex.: implementation DependenciesTest.androidCore
 */
object Dependencies {
    const val androidCore = "androidx.core:core-ktx:${Version.androidCoreVersion}"
    const val androidAppCompat = "androidx.appcompat:appcompat:${Version.androidAppCompat}"
    const val material = "com.google.android.material:material:${Version.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val koinAndroid = "io.insert-koin:koin-android:${Version.koinAndroid}"
    const val koinCore = "io.insert-koin:koin-core:${Version.koinAndroid}"
}

/**
 * Utilizar testImplementation.
 * Ex.: testImplementation DependenciesTest.junit
 */
object DependenciesTest {
    const val junit = "junit:junit:${Version.junit}"
    const val koinAndroid = "io.insert-koin:koin-test:${Version.koinAndroid}"
}

/**
 * Utilizar androidTestImplementation.
 * Ex.: androidTestImplementation DependenciesTest.testExt
 */
object DependenciesAndroidTest {
    const val testExt = "androidx.test.ext:junit:${Version.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.expressoCore}"
}