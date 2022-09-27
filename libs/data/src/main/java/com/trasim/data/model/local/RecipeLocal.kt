package com.trasim.data.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class RecipeLocal(
    @PrimaryKey
    val recipeId: String,
    val area: String?,
    val category: String?,
    val ingredients: List<String?>,
    val measures: List<String?>,
    val instructions: String?,
    val meal: String?,
    val mealThumb: String?,
    val tags: String?,
    val youtube: String?
)