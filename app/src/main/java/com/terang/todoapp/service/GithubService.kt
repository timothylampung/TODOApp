package com.terang.todoapp.service

import androidx.lifecycle.LiveData
import com.terang.todoapp.room.AppDatabase
import com.terang.todoapp.room.github.Repos

class GithubService(private val database: AppDatabase) {
    private val repoDao = this.database.reposGitHubDao()

    // TODO insert
    // TODO update
    // TODO delete
    // TODO getById

    fun getRepos(): LiveData<List<Repos>> = repoDao.findReposs()


}
