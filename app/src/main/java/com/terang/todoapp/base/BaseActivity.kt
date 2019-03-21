package com.terang.todoapp.base

import android.os.Bundle

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder

abstract class BaseActivity : AppCompatActivity() {
    private val TAG = "BaseActivity"
    var FRAGMENT_TAG: String? = null
    var fragment: Fragment? = null
    lateinit var manager: FragmentManager

    val json: Gson = GsonBuilder().setPrettyPrinting().serializeSpecialFloatingPointValues().serializeNulls().create()

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        manager = supportFragmentManager
        setContentView(contentViewRes())
        onCreated(savedInstanceState)
    }

    @LayoutRes
    protected abstract fun contentViewRes(): Int

    abstract fun onCreated(savedInstanceState: Bundle?)

    private fun addFragmentToActivity(
        fragmentManager: FragmentManager,
        fragment: Fragment,
        frameId: Int,
        tag: String?
    ) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId, fragment, tag)
        transaction.commit()
    }

    fun changeFragment(fragment: BaseFragment, frameId: Int) {
        this.fragment = manager.findFragmentByTag(FRAGMENT_TAG)
        if (this.fragment == null) {
            this.fragment = fragment
        }
        addFragmentToActivity(
            manager,
            this.fragment!!,
            frameId,
            FRAGMENT_TAG
        )
        updateUI()
    }

    open fun updateUI() {
    }

    companion object {
        val FRAGMENT_STATE = "FRAGMENT_STATE"
    }

}
