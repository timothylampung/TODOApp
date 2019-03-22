package com.terang.todoapp.view.github

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.terang.todoapp.room.github.Repos
import com.terang.todoapp.service.GithubService

class GithubListViewModel(private val githubService: GithubService) : ViewModel() {

    //TODO Get list of repos from github
    /*@param : null
    * @return repos
    * */

    fun getRepos(): LiveData<List<Repos>> = githubService.getRepos()

    fun addNewRepo() {}

    fun updateRepo() {}

    fun deleteRepo() {}

}