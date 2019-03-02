package com.timothy.todoapp.service

import com.google.gson.Gson
import com.timothy.todoapp.room.AppDatabase
import com.timothy.todoapp.room.reminder.Reminder
import com.timothy.todoapp.room.reminder.ReminderDao
import io.reactivex.Completable


class ReminderService(private val json: Gson,
                      private val database: AppDatabase) {

    val reminderDao: ReminderDao = this.database.reminderDao()

    fun save(reminder: Reminder): Completable? {
       return Completable.fromAction {
            //TODO
        }
    }

    //TODO get reminder
    //TODO delete reminder
    //TODO update reminder


    companion object {
        private const val TAG = "RmdrSvc"
    }

}