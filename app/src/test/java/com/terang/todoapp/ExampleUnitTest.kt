package com.terang.todoapp

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    val json: Gson = GsonBuilder()
                    .setPrettyPrinting()
                    .serializeSpecialFloatingPointValues()
                    .serializeNulls()
                    .create()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
