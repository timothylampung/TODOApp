package com.terang.todoapp.room

import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context
import androidx.room.Database
import com.terang.todoapp.room.config.Configuration
import com.terang.todoapp.room.config.ConfigurationDao
import com.terang.todoapp.room.github.Repos
import com.terang.todoapp.room.github.ReposDao
import com.terang.todoapp.room.reminder.Reminder
import com.terang.todoapp.room.reminder.ReminderDao


@Database(
    entities = [
        Configuration::class,
        Repos::class,
        Reminder::class],
    exportSchema = false, version = 5
)

abstract class AppDatabase : RoomDatabase() {

    abstract fun configurationDao(): ConfigurationDao
    abstract fun reminderDao(): ReminderDao
    abstract fun reposGitHubDao(): ReposDao //TODO declare daos

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
