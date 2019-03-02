package com.timothy.todoapp.room

import java.lang.reflect.ParameterizedType
import androidx.sqlite.db.SimpleSQLiteQuery
import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteQuery


abstract class GenericDao<E> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(e: E)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(e: List<E>)

    @Update
    abstract fun update(e: E)

    @Delete
    abstract fun delete(e: E)

}