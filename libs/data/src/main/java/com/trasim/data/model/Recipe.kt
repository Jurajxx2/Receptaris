package com.trasim.data.model

data class Recipe(
    val recipeId: String,
    val area: String?,
    val category: String?,
    val ingredients: List<Ingredient>,
    val instructions: String?,
    val meal: String?,
    val mealThumb: String?,
    val tags: String?,
    val youtube: String?
)