package com.example.daggerhiltdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerhiltdemo.di.AppModule
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var retrofitRespository: RetrofitRespository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        retrofitRespository = RetrofitRespository("hello")
        retrofitRespository.show()
    }
}