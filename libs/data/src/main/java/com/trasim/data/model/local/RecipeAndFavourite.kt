package com.trasim.data.model.local

import androidx.room.Embedded
import androidx.room.Relation

data class RecipeAndFavourite(
    @Embedded val meal: RecipeLocal,
    @Relation(
        parentColumn = "recipeId",
        entityColumn = "recipeReference"
    )
    val favourite: FavouriteLocal
)