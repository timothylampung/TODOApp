package com.timothy.todoapp.room

import androidx.room.*


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