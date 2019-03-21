package com.terang.todoapp.view.main

import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import androidx.lifecycle.Observer
import com.terang.todoapp.base.BaseActivity
import com.terang.todoapp.R
import com.terang.todoapp.room.reminder.Reminder
import io.reactivex.CompletableObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private val viewModel: MainActivityViewModel by viewModel()

    override fun contentViewRes(): Int = R.layout.activity_main

    override fun onCreated(savedInstanceState: Bundle?) {
        viewModel.findReminders().observe(this, Observer {
            radio_group.removeAllViews()
            for (reminder in it!!) {
                val radio = RadioButton(this)
                radio.text =reminder.title
                radio_group.addView(radio)
                Log.d("MainAct", json.toJson(reminder))
            }

        })


        btn_submit.setOnClickListener {

            val reminder = Reminder();
            reminder.note = et_note.text.toString()
            reminder.title = et_title.text.toString()
            viewModel.saveReminder(reminder)!!.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(object : CompletableObserver {
                    override fun onComplete() {
                        Log.d("mainAct", "saveReminder.onComplete")
                    }

                    override fun onSubscribe(d: Disposable) {
                        Log.d("mainAct", "saveReminder.onSubscribe $d")
                    }

                    override fun onError(e: Throwable) {
                        Log.d("mainAct", "saveReminder.onError $e")
                    }
                })
        }

    }

}
