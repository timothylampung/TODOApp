package com.timothy.todoapp.service

import com.google.gson.Gson
import com.timothy.todoapp.room.AppDatabase
import com.timothy.todoapp.room.reminder.ReminderDao

class ReminderService(private val json: Gson,
                      private val database: AppDatabase) {

    val reminderDao: ReminderDao = this.database.reminderDao()

    //TODO save reminder
    //TODO get reminder
    //TODO delete reminder
    //TODO update reminder


    companion object {
        private const val TAG = "RmdrSvc"
    }

}