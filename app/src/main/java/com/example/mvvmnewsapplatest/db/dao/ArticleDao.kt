package com.example.mvvmnewsapplatest.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmnewsapplatest.model.ArticleEntity

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert (article: ArticleEntity): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<ArticleEntity>>

    @Delete
    suspend fun deleteArticle (article: ArticleEntity)

}