package com.trasim.recipes.usecase

import org.koin.dsl.module

internal val useCaseModule = module {
    single { AddRecipesToFavouritesUseCase(get()) }
    single { GetFavouriteRecipesUseCase(get()) }
    single { GetRecipeByCategoryUseCase(get()) }
    single { GetRecipeCategoriesUseCase(get()) }
    single { RemoveRecipeFromFavouritesUseCase(get()) }
}