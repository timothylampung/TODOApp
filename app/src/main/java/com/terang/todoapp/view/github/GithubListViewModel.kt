package com.terang.todoapp.view.github

import androidx.lifecycle.ViewModel
import com.terang.todoapp.service.GithubService

class GithubListViewModel(private val githubService: GithubService) : ViewModel() {

    //TODO Get list of repos from github
    /*@param : null
    * @return repos
    * */
    fun getRepos() {
       this.githubService.getRepos()
        //TODO
    }


}