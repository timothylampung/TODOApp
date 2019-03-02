package com.timothy.todoapp.service

import android.util.Log
import androidx.lifecycle.LiveData
import com.google.gson.Gson
import com.timothy.todoapp.room.AppDatabase
import com.timothy.todoapp.room.reminder.Reminder
import com.timothy.todoapp.room.reminder.ReminderDao
import io.reactivex.Completable


class ReminderService(
    private val json: Gson,
    private val database: AppDatabase
) {

    private val reminderDao: ReminderDao = this.database.reminderDao()

    fun save(reminder: Reminder): Completable {
        Log.d(TAG, "save reminder : " + json.toJson(reminder))
        return Completable.fromAction {
            this.reminderDao.insert(reminder)
        }
    }

    fun findReminderById(id: Long): LiveData<Reminder> = this.reminderDao.findReminderById(id)

    fun findReminders(): LiveData<List<Reminder>> = this.reminderDao.findReminders()

    fun deleteReminder(reminder: Reminder): Completable? {
        Log.d(TAG, "deleteReminder reminder : " + json.toJson(reminder))
        return Completable.fromAction {
            this.reminderDao.delete(reminder)
        }
    }

    fun updateReminder(reminder: Reminder): Completable? {
        Log.d(TAG, "updateReminder reminder : " + json.toJson(reminder))
        return Completable.fromAction {
            this.reminderDao.update(reminder)
        }
    }

    companion object {
        private const val TAG = "RmdrSvc"
    }

}