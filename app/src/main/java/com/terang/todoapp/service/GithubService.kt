package com.terang.todoapp.service

import com.terang.todoapp.room.AppDatabase

class GithubService(private val database: AppDatabase) {


    private val repoDao = this.database.reposGitHubDao()

    // TODO insert
    // TODO update
    // TODO delete
    // TODO getById


    fun getRepos() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
