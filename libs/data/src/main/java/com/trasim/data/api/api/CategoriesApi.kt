package com.trasim.data.api.api

import com.trasim.data.model.remote.GetCategoriesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CategoriesApi {

    @GET("categories.php")
    suspend fun getCategories(): GetCategoriesResponse
}