package com.example.movizapp.view

import androidx.compose.runtime.Composable
import com.example.movizapp.viewmodel.MovieViewModel

@Composable
fun MovieScreen(viewModel: MovieViewModel) {

    // no need for observeAsState, we are not using
    // LiveData, we are using MutableStateOf

    // Any changes in 'movie' state var, it'll trigger
    // an automatic recomposition to this 'MovieScrenn' composable

    val moviesList = viewModel.movies
    MovieList(movies = moviesList)
}