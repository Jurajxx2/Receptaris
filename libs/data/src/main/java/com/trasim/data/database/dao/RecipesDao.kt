package com.trasim.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.trasim.data.model.local.RecipeLocal
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipe: RecipeLocal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipes: List<RecipeLocal>)

    @Query("SELECT * FROM recipes")
    fun getAllRecipes(): Flow<List<RecipeLocal>>

    @Query("SELECT * FROM recipes WHERE category =:categoryId")
    fun getRecipesByCategoryId(categoryId: String): Flow<List<RecipeLocal>>

    @Query("SELECT * FROM recipes WHERE recipeId =:id")
    fun getRecipeById(id: String): Flow<RecipeLocal>
}