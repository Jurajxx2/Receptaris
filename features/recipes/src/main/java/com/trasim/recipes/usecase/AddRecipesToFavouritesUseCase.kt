package com.trasim.recipes.usecase

import com.trasim.data.repository.RecipesRepository

class AddRecipesToFavouritesUseCase(private val recipesRepository: RecipesRepository) {

    suspend fun execute(recipeId: String) {
        recipesRepository.addRecipeToFavourites(recipeId)
    }
}