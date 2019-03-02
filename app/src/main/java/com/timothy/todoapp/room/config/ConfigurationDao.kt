package com.timothy.todoapp.room.config

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.timothy.todoapp.room.GenericDao

@Dao
abstract class ConfigurationDao : GenericDao<Configuration>() {

    @Query("select * from Configuration where `key`=:inputKey ")
    abstract fun findConfigurationByKey(inputKey: String): Configuration

    @Query("select * from Configuration")
    abstract fun findConfigurations(): LiveData<List<Configuration>>
}
