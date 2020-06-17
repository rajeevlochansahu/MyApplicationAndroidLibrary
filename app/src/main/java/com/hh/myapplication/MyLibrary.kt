package com.hh.myapplication

import android.util.Log

/**
 * Created by Rajeev Sahu on 1/6/20.
 */
open class MyLibrary {
    fun printLog(message: String) {
        Log.d(this.javaClass.name, message)
    }
}