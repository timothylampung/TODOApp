package com.terang.todoapp.room.config

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Configuration {
    @field:PrimaryKey
    @field:ColumnInfo(name = "key")
    var key: String ="DEF"
    @field:ColumnInfo(name = "value")
    var value: String? =null
}
