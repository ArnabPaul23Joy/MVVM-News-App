package com.example.mvvmnewsapplatest.app.infrastructure.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mvvmnewsapplatest.app.infrastructure.storage.dao.ArticleDao
import com.example.mvvmnewsapplatest.app.model.ArticleEntity
import com.example.mvvmnewsapplatest.app.infrastructure.network.constants.Constants

@Database (
    entities = [ArticleEntity::class],
    version = Constants.Companion.VERSION_NUMBER
)
@TypeConverters (DataTypeConverter::class)
abstract class NewsArticleDatabase: RoomDatabase() {

    abstract fun getArticleDao(): ArticleDao
}