package com.example.test_LAB_WEEK_13.api

import androidx.lifecycle.viewmodel.CreationExtras
import com.example.test_LAB_WEEK_13.model.PopularMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("movie/popular")

    suspend fun getPopularMovies(
        @Query("api_key")  apiKey: String
    ): PopularMoviesResponse
}