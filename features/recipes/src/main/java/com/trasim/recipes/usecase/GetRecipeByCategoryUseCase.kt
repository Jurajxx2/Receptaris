package com.trasim.recipes.usecase

import com.trasim.data.repository.RecipesRepository

class GetRecipeByCategoryUseCase(private val recipesRepository: RecipesRepository) {

    fun execute(category: String) = recipesRepository.getRecipesByCategory(category)
}