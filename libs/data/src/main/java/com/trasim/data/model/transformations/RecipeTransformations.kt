package com.trasim.data.model.transformations

import com.trasim.data.model.Ingredient
import com.trasim.data.model.Recipe
import com.trasim.data.model.local.RecipeLocal
import com.trasim.data.model.remote.GetRecipesResponse

fun RecipeLocal.fromLocal() = Recipe(
    recipeId,
    area,
    category,
    ingredients.zip(measures) { ingredient, measure -> Ingredient(ingredient, measure) },
    instructions,
    meal,
    mealThumb,
    tags,
    youtube
)

fun GetRecipesResponse.Meal.fromRemote() = Recipe(
    idMeal,
    strArea,
    strCategory,
    listOf(
        strIngredient1,
        strIngredient2,
        strIngredient3,
        strIngredient4,
        strIngredient5,
        strIngredient6,
        strIngredient7,
        strIngredient8,
        strIngredient9,
        strIngredient10,
        strIngredient11,
        strIngredient12,
        strIngredient13,
        strIngredient14,
        strIngredient15,
        strIngredient16,
        strIngredient17,
        strIngredient18,
        strIngredient19,
        strIngredient20
    ).zip (listOf(
        strMeasure1,
        strMeasure2,
        strMeasure3,
        strMeasure4,
        strMeasure5,
        strMeasure6,
        strMeasure7,
        strMeasure8,
        strMeasure9,
        strMeasure10,
        strMeasure11,
        strMeasure12,
        strMeasure13,
        strMeasure14,
        strMeasure15,
        strMeasure16,
        strMeasure17,
        strMeasure18,
        strMeasure19,
        strMeasure20
    )) { ingredient, measure ->
        Ingredient(
            ingredient,
            measure
        )
    },
    strInstructions,
    strMeal,
    strMealThumb,
    strTags,
    strYoutube
)

fun GetRecipesResponse.Meal.toLocal() = RecipeLocal(
    idMeal,
    strArea,
    strCategory,
    listOf(
        strIngredient1,
        strIngredient2,
        strIngredient3,
        strIngredient4,
        strIngredient5,
        strIngredient6,
        strIngredient7,
        strIngredient8,
        strIngredient9,
        strIngredient10,
        strIngredient11,
        strIngredient12,
        strIngredient13,
        strIngredient14,
        strIngredient15,
        strIngredient16,
        strIngredient17,
        strIngredient18,
        strIngredient19,
        strIngredient20
    ),
    listOf(
        strMeasure1,
        strMeasure2,
        strMeasure3,
        strMeasure4,
        strMeasure5,
        strMeasure6,
        strMeasure7,
        strMeasure8,
        strMeasure9,
        strMeasure10,
        strMeasure11,
        strMeasure12,
        strMeasure13,
        strMeasure14,
        strMeasure15,
        strMeasure16,
        strMeasure17,
        strMeasure18,
        strMeasure19,
        strMeasure20
    ),
    strInstructions,
    strMeal,
    strMealThumb,
    strTags,
    strYoutube
)