package com.example.movizapp.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    // Define the End Points
    // Retrofit uses annotations to describr the HTTP
    // Request methods and parameters

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey: String
    ): MovieResponse
}