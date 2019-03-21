package com.terang.todoapp

import android.app.Application
import com.terang.todoapp.util.Modules
import org.koin.android.ext.android.startKoin

class App  : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(
                Modules.appModules
        ) )
    }
}