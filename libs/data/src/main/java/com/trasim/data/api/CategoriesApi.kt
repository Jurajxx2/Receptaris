package com.trasim.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface CategoriesApi {

    @GET("random.php")
    suspend fun getPropertyResponse(
        @Query("ob") orderBy: String = ORDER_BY_NONE
    ): PropertyResponse
}