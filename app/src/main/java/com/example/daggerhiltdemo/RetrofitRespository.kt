package com.example.daggerhiltdemo

import android.util.Log
import javax.inject.Inject

class RetrofitRespository @Inject constructor(private val string: String) {

    fun show(){
        Log.d("ALOOOO", "show:${string.length} ")
    }
}