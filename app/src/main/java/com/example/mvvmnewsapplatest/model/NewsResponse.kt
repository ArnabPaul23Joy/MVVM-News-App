package com.example.mvvmnewsapplatest.model

data class NewsResponse(
    val articles: List<ArticleEntity>,
    val status: String,
    val totalResults: Int
)