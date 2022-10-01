package com.trasim.recipes.usecase

import com.trasim.data.model.Recipe
import com.trasim.data.repository.RecipesRepository
import kotlinx.coroutines.flow.flow

class GetFavouriteRecipesUseCase(private val recipesRepository: RecipesRepository) {

    fun execute() = recipesRepository.getFavouriteRecipes()
}