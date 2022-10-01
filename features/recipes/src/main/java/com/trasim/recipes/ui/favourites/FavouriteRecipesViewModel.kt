package com.trasim.recipes.ui.favourites

import androidx.lifecycle.ViewModel
import com.trasim.recipes.usecase.AddRecipesToFavouritesUseCase
import com.trasim.recipes.usecase.GetFavouriteRecipesUseCase
import com.trasim.recipes.usecase.RemoveRecipeFromFavouritesUseCase

class FavouriteRecipesViewModel(
    private val getFavouriteRecipesUseCase: GetFavouriteRecipesUseCase
) : ViewModel() {

}