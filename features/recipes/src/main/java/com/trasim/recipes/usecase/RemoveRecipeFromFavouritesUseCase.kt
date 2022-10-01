package com.trasim.recipes.usecase

import com.trasim.data.repository.RecipesRepository

class RemoveRecipeFromFavouritesUseCase(private val recipesRepository: RecipesRepository) {

    suspend fun execute(recipeId: String) {
        recipesRepository.removeRecipeFromFavourites(recipeId)
    }
}