package com.terang.todoapp.room.github

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TRG_REPO")
class Repos {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0

    @ColumnInfo(name = "title")
    var title: String? = null

    @ColumnInfo(name = "author")
    var author: String? = null

}