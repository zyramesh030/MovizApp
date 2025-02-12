package com.example.movizapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.movizapp.retrofit.Movie

@Database(entities = [Movie::class], version = 1)
abstract class MoviesDB: RoomDatabase() {

    // Dao
    abstract val moviesDao: MovieDao

    companion object{

        // Volatile: prevents any possible race
        // conditions in multithreading

        @Volatile
        private var INSTANCE: MoviesDB ?= null

        fun getInstance(context : Context) : MoviesDB {

            // ensuring that only one thread can execute the
            // block of code inside the synchronized block at
            // any given time


            synchronized(this) {
                var instance = INSTANCE
                if(instance == null) {
                    // creating the DB object
                    instance = Room.databaseBuilder(
                        context = context.applicationContext,
                        MoviesDB::class.java,
                        "movies_db"
                    ).build()
                }

                INSTANCE = instance
                return instance
            }
        }
    }
}