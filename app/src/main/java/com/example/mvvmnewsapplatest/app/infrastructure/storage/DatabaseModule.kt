package com.example.mvvmnewsapplatest.app.infrastructure.storage

import android.content.Context
import androidx.room.Room
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

object DatabaseModule {
    @Singleton
    @Provides
    fun provideNewsArticleDatabase(@ApplicationContext context: Context): NewsArticleDatabase {
        return Room.databaseBuilder(
            context,
            NewsArticleDatabase::class.java,
            DatabaseConfig.DATABASE_NAME
        ).build()
    }
}