package com.trasim.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.trasim.data.model.local.RecipeLocal

@Dao
interface RecipesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipe: RecipeLocal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipes: List<RecipeLocal>)

    @Query("SELECT * FROM recipes")
    suspend fun getAllRecipes(): List<RecipeLocal>

    @Query("SELECT * FROM recipes WHERE recipeId =:id")
    suspend fun getRecipeById(id: String): RecipeLocal?

}