package com.example.movizapp.retrofit

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movies_table")
data class Movie(

    @PrimaryKey
    val id: Int,

    val title: String,
    val overview: String,
    val poster_path: String
)