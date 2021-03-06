package com.example.retrofittraining.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TrainingApp : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TrainingApp)
            modules(listOf(marsModule))
        }
    }
}