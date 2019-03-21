package com.terang.todoapp.util

import com.google.gson.GsonBuilder
import com.terang.todoapp.room.AppDatabase
import com.terang.todoapp.service.ReminderService
import com.terang.todoapp.view.main.MainActivityViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object Modules {
    val appModules = module {
        single { GsonBuilder().setPrettyPrinting().serializeSpecialFloatingPointValues().serializeNulls().create() }
        factory { AppDatabase.getInstance(get()) }

        single { ReminderService(get(), get()) }
        viewModel { MainActivityViewModel(get()) }

    }
}