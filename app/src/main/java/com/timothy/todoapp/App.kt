package com.example.nzais.spotitmobile

import android.app.Application
import com.koin.util.Modules
import org.koin.android.ext.android.startKoin

class App  : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(
                Modules.appModules
        ) )
    }
}