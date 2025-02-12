package com.example.movizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import com.example.movizapp.repository.MovieRepository
import com.example.movizapp.room.MoviesDB
import com.example.movizapp.ui.theme.MovizAppTheme
import com.example.movizapp.view.MovieScreen
import com.example.movizapp.viewmodel.MovieViewModel
import com.example.movizapp.viewmodel.MovieViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // repository
        val repository = MovieRepository(applicationContext)

        // view model factory
        val viewModelFactory = MovieViewModelFactory(repository)

        // viewmodel
        val viewModel = ViewModelProvider(
            this,
            viewModelFactory
        )[MovieViewModel::class.java]


        super.onCreate(savedInstanceState)

        setContent {
            MovieScreen(viewModel = viewModel)
        }
    }
}

@Composable
fun HeaderComposable() {

    Column(
        horizontalAlignment =
            Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 12.dp)
    ) {
        Text(
            "The Moviz App",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            "Get Popular Movies",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
    }
}
