package com.terang.todoapp.view.main

import android.os.Bundle
import android.util.Log
import com.terang.todoapp.base.BaseActivity
import com.terang.todoapp.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private val viewModel: MainActivityViewModel by viewModel()

    override fun contentViewRes(): Int = R.layout.activity_main

    override fun onCreated(savedInstanceState: Bundle?) {

        btn_submit.setOnClickListener {
            var note = et_note.text.toString()
            var title = et_title.text.toString()
            Log.d("MainAct", "$note $title")
        }

    }



}
