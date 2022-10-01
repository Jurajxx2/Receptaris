package com.trasim.recipes.ui.detail

import androidx.lifecycle.ViewModel
import com.trasim.recipes.usecase.AddRecipesToFavouritesUseCase
import com.trasim.recipes.usecase.RemoveRecipeFromFavouritesUseCase

class RecipeDetailViewModel(
    private val addRecipesToFavouritesUseCase: AddRecipesToFavouritesUseCase,
    private val removeRecipeFromFavouritesUseCase: RemoveRecipeFromFavouritesUseCase
) : ViewModel() {
}