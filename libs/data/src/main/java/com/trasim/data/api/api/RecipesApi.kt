package com.trasim.data.api.api

import com.trasim.data.model.remote.GetRecipesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipesApi {

    @GET("filter.php")
    suspend fun getRecipesByCategory(@Query("c") category: String): GetRecipesResponse

    @GET("random.php")
    suspend fun getRandomRecipe(): GetRecipesResponse
}