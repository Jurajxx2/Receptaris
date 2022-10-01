package com.trasim.data.repository

import com.trasim.data.model.Recipe
import com.trasim.utils.Resource
import kotlinx.coroutines.flow.Flow

interface RecipesRepository {
    fun getFavouriteRecipes(): Flow<Resource<List<Recipe>>>
    suspend fun addRecipeToFavourites(recipeId: String)
    suspend fun removeRecipeFromFavourites(recipeId: String)
    fun getRecipesByCategory(category: String): Flow<Resource<List<Recipe>>>
    fun getRandomRecipe(): Flow<Resource<Recipe?>>
}