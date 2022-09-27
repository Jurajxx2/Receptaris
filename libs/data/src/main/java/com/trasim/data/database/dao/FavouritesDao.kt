package com.trasim.data.database.dao

import androidx.room.*
import com.trasim.data.model.local.FavouriteLocal
import com.trasim.data.model.local.RecipeAndFavourite

@Dao
interface FavouritesDao {

    @Insert
    fun addToFavourites(favourite: FavouriteLocal)

    @Query("DELETE FROM favourites WHERE mealId = :id")
    fun deleteByMealId(id: String)

    @Transaction
    @Query("SELECT * FROM favourites")
    fun getFavouriteMeals(): List<RecipeAndFavourite>
}