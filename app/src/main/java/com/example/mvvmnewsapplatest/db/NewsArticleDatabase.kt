package com.example.mvvmnewsapplatest.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmnewsapplatest.db.dao.ArticleDao
import com.example.mvvmnewsapplatest.model.ArticleEntity
import com.example.mvvmnewsapplatest.network.constants.Constants.Companion.VERSION_NUMBER

@Database (
    entities = [ArticleEntity::class],
    version = VERSION_NUMBER
)
abstract class NewsArticleDatabase: RoomDatabase() {

    abstract fun getArticleDao(): ArticleDao
}