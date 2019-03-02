package com.timothy.todoapp.room.reminder

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Reminder {
    @field:PrimaryKey(autoGenerate = true)
    @field:ColumnInfo(name = "id")
    var id: Long = 0

    @field:ColumnInfo(name = "title")
    var title: String? = null

    @field:ColumnInfo(name = "note")
    var note: String? = null

}