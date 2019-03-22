package com.terang.todoapp.room.github

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.terang.todoapp.room.GenericDao

@Dao
abstract class ReposDao : GenericDao<Repos>() {

    @Query("select * from TRG_REPO where id=:id ")
    abstract fun findReposById(id: Long): LiveData<Repos>

    @Query("select * from TRG_REPO")
    abstract fun findReposs(): LiveData<List<Repos>>
}