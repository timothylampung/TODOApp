package com.timothy.todoapp.view.main

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.nzais.spotitmobile.base.BaseActivity
import com.google.android.material.chip.Chip
import com.timothy.todoapp.R
import com.timothy.todoapp.room.reminder.Reminder
import io.reactivex.CompletableObserver
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private val viewModel: MainActivityViewModel by viewModel()

    override fun contentViewRes(): Int = R.layout.activity_main

    override fun onCreated(savedInstanceState: Bundle?) {
        btn_submit.setOnClickListener {

            var reminder = Reminder();
            reminder.note = et_note.text.toString()
            reminder.title = et_title.text.toString()
            viewModel.saveReminder(reminder)!!.observeOn(Schedulers.io())
                .subscribe(object : CompletableObserver {
                    override fun onComplete() {
                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onError(e: Throwable) {
                    }
                })
        }

        viewModel.findReminders().observe(this, Observer {

            chip_group.removeAllViews()

            for (reminder in it!!) {
                val chip = Chip(this)
                Log.d("MainAct", json.toJson(reminder))
                chip.text = reminder.title
                chip_group.addView(chip)
            }

        })
    }

}
