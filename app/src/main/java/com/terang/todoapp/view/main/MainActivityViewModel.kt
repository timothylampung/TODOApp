package com.terang.todoapp.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.terang.todoapp.room.reminder.Reminder
import com.terang.todoapp.service.ReminderService
import io.reactivex.Completable

class MainActivityViewModel(private val reminderService: ReminderService) : ViewModel() {

    fun saveReminder(reminder: Reminder): Completable? = reminderService.save(reminder)
    fun findReminderById(id: Long): LiveData<Reminder> = reminderService.findReminderById(id)
    fun findReminders() : LiveData<List<Reminder>> = reminderService.findReminders()
    fun deleteReminder(reminder: Reminder): Completable? = reminderService.deleteReminder(reminder)
    fun updateReminder(reminder: Reminder): Completable? = reminderService.updateReminder(reminder)

    companion object {
        private const val TAG = "RmndrVm"
    }
}