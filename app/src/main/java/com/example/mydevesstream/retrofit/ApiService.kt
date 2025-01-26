package com.example.mydevesstream.retrofit

import com.example.mydevesstream.model.movieList.movieResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("/?apikey=10598421&s=Batman")
    suspend fun getItems(
        @Query("page") page: Int
    ) : movieResponseModel


}