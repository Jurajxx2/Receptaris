package com.trasim.recipes

import com.trasim.recipes.ui.viewModelModule
import com.trasim.recipes.usecase.useCaseModule
import org.koin.dsl.module

val recipesModules = listOf(
    viewModelModule,
    useCaseModule
)