package com.timothy.todoapp.util

import com.timothy.todoapp.room.AppDatabase
import com.timothy.todoapp.view.main.MainActivityViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object Modules {
    val appModules = module {

        // database, dao
        // service
        single { AppDatabase.getInstance(get()) }

        module("Main"){
            viewModel { MainActivityViewModel() }
        }

    }
}