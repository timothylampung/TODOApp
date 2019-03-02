package com.example.nzais.spotitmobile

import android.app.Application
import com.timothy.todoapp.util.Modules
import org.koin.android.ext.android.startKoin

class App  : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(
                Modules.appModules
        ) )
    }
}