package com.trasim.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.trasim.data.model.local.CategoryLocal
import com.trasim.data.model.local.RecipeLocal
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoriesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipe: CategoryLocal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipes: List<CategoryLocal>)

    @Query("SELECT * FROM categories")
    fun getAllCategories(): Flow<List<CategoryLocal>>

    @Query("SELECT * FROM categories WHERE categoryId =:id")
    fun getCategoryById(id: String): Flow<CategoryLocal?>
}