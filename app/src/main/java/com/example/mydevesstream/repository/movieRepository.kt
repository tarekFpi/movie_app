package com.example.mydevesstream.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mydevesstream.model.movieList.Search
import com.example.mydevesstream.model.movieList.movieResponseModel
import com.example.mydevesstream.retrofit.ApiService
import com.example.mydevesstream.utils.Resource
import javax.inject.Inject

class MovieRepository @Inject constructor(val apiService: ApiService){


            suspend fun fetchMovies(page: Int): movieResponseModel {

                return apiService.getItems(page)
        }

}