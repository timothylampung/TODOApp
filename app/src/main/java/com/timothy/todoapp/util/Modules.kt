package com.timothy.todoapp.util

import com.google.gson.GsonBuilder
import com.timothy.todoapp.room.AppDatabase
import com.timothy.todoapp.service.ReminderService
import com.timothy.todoapp.view.main.MainActivityViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object Modules {
    val appModules = module {
        single { GsonBuilder().setPrettyPrinting().serializeSpecialFloatingPointValues().serializeNulls().create() }
        single { AppDatabase.getInstance(get()) }

        module("Main") {
            single { ReminderService(get(), get()) }
            viewModel { MainActivityViewModel(get()) }
        }

    }
}