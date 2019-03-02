package com.timothy.todoapp.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.timothy.todoapp.room.reminder.Reminder
import com.timothy.todoapp.service.ReminderService
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