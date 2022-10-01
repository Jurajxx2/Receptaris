package com.trasim.recipes.usecase

import com.trasim.data.repository.CategoriesRepository
import com.trasim.data.repository.RecipesRepository

class GetRecipeCategoriesUseCase(private val categoriesRepository: CategoriesRepository) {

    fun execute() = categoriesRepository.getCategories()
}