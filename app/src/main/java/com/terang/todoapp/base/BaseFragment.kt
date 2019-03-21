package com.terang.todoapp.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment


abstract class BaseFragment : Fragment() {
    private val TAG = "BaseFrag"


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        customActivityCreated(savedInstanceState)
    }

     open fun customActivityCreated(savedInstanceState: Bundle?) {}

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layoutRes(), container, false)
        onViewBound(view)
        return view
    }

    @LayoutRes
    protected abstract fun layoutRes(): Int

    protected fun onViewBound(view: View) {

    }

}