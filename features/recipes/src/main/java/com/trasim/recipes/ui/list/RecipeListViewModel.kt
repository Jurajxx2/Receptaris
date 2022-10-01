package com.trasim.recipes.ui.list

import androidx.lifecycle.ViewModel
import com.trasim.recipes.usecase.GetRecipeByCategoryUseCase
import com.trasim.recipes.usecase.GetRecipeCategoriesUseCase

class RecipeListViewModel(
    private val getRecipeCategoriesUseCase: GetRecipeCategoriesUseCase,
    private val getRecipeByCategoryUseCase: GetRecipeByCategoryUseCase
) : ViewModel() {

}