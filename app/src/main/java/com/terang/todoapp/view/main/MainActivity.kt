package com.terang.todoapp.view.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.terang.todoapp.base.BaseActivity
import com.terang.todoapp.R
import com.terang.todoapp.view.github.GitHubListActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private val viewModel: MainActivityViewModel by viewModel()

    override fun contentViewRes(): Int = R.layout.activity_main

    override fun onCreated(savedInstanceState: Bundle?) {
        btn_submit.setOnClickListener {
            navigateToGithubActivity()
        }
    }

    private fun navigateToGithubActivity() {
        val i = Intent(this, GitHubListActivity::class.java)
        startActivity(i)
    }


}
