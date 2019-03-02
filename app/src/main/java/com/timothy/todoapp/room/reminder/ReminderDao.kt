package com.timothy.todoapp.room.reminder

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.timothy.todoapp.room.GenericDao

@Dao
abstract class ReminderDao : GenericDao<Reminder>() {

    @Query("select * from Reminder where id=:id ")
    abstract fun findReminderById(id: Long): LiveData<Reminder>

    @Query("select * from Reminder")
    abstract fun findReminders(): LiveData<List<Reminder>>
}