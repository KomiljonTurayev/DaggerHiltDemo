package com.example.daggerhiltdemo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideContext(@ApplicationContext context: ApplicationContext) = context as HiltAndroidApp

    @Provides
    @Singleton
    fun provideStr() = "Hello my Hilt"

    @Provides
    fun provideRetrofit(string: String):String = string.toString()
}