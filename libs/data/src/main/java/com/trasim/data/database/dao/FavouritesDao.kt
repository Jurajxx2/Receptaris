package com.trasim.data.database.dao

import androidx.room.*
import com.trasim.data.model.local.FavouriteLocal
import com.trasim.data.model.local.RecipeAndFavourite
import kotlinx.coroutines.flow.Flow

@Dao
interface FavouritesDao {

    @Insert
    fun addToFavourites(favourite: FavouriteLocal)

    @Query("DELETE FROM favourites WHERE recipeReference = :id")
    fun deleteByRecipeId(id: String)

    @Transaction
    @Query("SELECT * FROM favourites")
    fun getFavouriteRecipes(): Flow<List<RecipeAndFavourite>>
}