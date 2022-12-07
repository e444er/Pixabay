package com.e444er.pixabay.data.network

import com.e444er.pixabay.data.model.PixabayDTO
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://pixabay.com/"

interface ApiService {

    // https://pixabay.com/api/?key=YOUR_API_KEY&query=sunflower

    @GET("api/")
    suspend fun getSearchImage(
        @Query("key") key: String,
        @Query("q") query: String
    ): PixabayDTO

}