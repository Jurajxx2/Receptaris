package com.trasim.dashboard.usecase

import org.koin.dsl.module

internal val useCaseModule = module {
    single { GetRandomRecipeUseCase(get()) }
}