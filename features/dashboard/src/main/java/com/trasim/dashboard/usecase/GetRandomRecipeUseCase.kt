package com.trasim.dashboard.usecase

import com.trasim.data.repository.RecipesRepository

class GetRandomRecipeUseCase(private val recipesRepository: RecipesRepository) {

    fun execute() = recipesRepository.getRandomRecipe()
}