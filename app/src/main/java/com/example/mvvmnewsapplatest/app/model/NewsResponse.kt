package com.example.mvvmnewsapplatest.app.model

data class NewsResponse(
    val articles: List<ArticleEntity>,
    val status: String,
    val totalResults: Int
)