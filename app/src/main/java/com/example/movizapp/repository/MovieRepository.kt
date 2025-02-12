package com.example.movizapp.repository

import android.content.Context
import com.example.movizapp.retrofit.Movie
import com.example.movizapp.retrofit.RetrofitInstance
import com.example.movizapp.room.MovieDao
import com.example.movizapp.room.MoviesDB

// Repository: Manages data operations & abstract the data source.
// Acts as a bridge between different data source(online DB, local DB..)
// and the rest of the app

class MovieRepository(context: Context) {

    // Fetching data from Online API

    suspend fun getPopularMoviesFromOnlineAPI(apiKey: String): List<Movie> {
        return RetrofitInstance.api.getPopularMovies(apiKey).results
    }

    // Fetching data from offline ROOM DB
    private val db = MoviesDB.getInstance(context)
    private val movieDao: MovieDao = db.moviesDao

    suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getAllMoviesInDB()
    }

    suspend fun insertMoviesIntoDB(movies: List<Movie>) {
        return movieDao.insertMoviesList(movies)
    }

    suspend fun insertMovieIntoDB(movie: Movie) {
        return movieDao.insert(movie)
    }
}