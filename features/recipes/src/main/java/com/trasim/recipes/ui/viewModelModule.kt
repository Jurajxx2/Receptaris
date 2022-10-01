package com.trasim.recipes.ui

import com.trasim.recipes.ui.detail.RecipeDetailViewModel
import com.trasim.recipes.ui.favourites.FavouriteRecipesViewModel
import com.trasim.recipes.ui.list.RecipeListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val viewModelModule = module {
    viewModel { RecipeListViewModel(get(),get()) }
    viewModel { FavouriteRecipesViewModel(get()) }
    viewModel { RecipeDetailViewModel(get(),get()) }
}