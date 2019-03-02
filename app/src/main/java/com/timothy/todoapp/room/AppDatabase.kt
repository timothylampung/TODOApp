package com.timothy.todoapp.room

import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context
import com.timothy.todoapp.room.config.Configuration
import com.timothy.todoapp.room.config.ConfigurationDao


@androidx.room.Database(entities = [Configuration::class], exportSchema = false, version = 4)
abstract class AppDatabase : RoomDatabase() {

    abstract fun configurationDao(): ConfigurationDao


    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context,
                            AppDatabase::class.java,
                            "TODO_APP"
                        )
                            .build()
                    }
                }
            }
            return INSTANCE!!
        }
    }


}
