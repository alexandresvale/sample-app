package com.alexandresvale.sampleapp.core

import android.app.Application
import com.alexandresvale.data.di.dataModules
import com.alexandresvale.domain.di.domainModule
import com.alexandresvale.sampleapp.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(this@MyApplication)
            modules(
                presentationModule +
                        domainModule +
                        dataModules
            )
        }
    }
}