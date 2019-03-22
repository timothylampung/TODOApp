package com.terang.todoapp.view.github

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.terang.todoapp.R
import com.terang.todoapp.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

class GitHubListActivity : BaseActivity() {

    private val viewModel: GithubListViewModel by viewModel()

    override fun contentViewRes(): Int = R.layout.activity_git_hub_list

    override fun onCreated(savedInstanceState: Bundle?) {
        viewModel.getRepos()
            .observe(this, Observer {
                if (it!!.isEmpty()) return@Observer
                Log.d(TAG, json.toJson(it))
            })
    }

    //

    companion object {
        const val TAG = "GHUBLSTACT"
    }

}
