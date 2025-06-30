package com.example.mvvmnewsapplatest.network.api

import com.example.mvvmnewsapplatest.network.constants.Constants.Companion.API_KEY
import com.example.mvvmnewsapplatest.network.response.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET ("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query ("country")
        countryCode: String = "us",
        @Query ("page")
        pageNumber: Int,
        @Query ("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}