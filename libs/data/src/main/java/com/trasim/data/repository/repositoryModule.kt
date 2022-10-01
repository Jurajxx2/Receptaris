package com.trasim.data.repository

import androidx.room.Room
import com.trasim.data.database.ReceptarisDatabase
import com.trasim.data.repository.impl.CategoriesRepositoryImpl
import com.trasim.data.repository.impl.RecipesRepositoryImpl
import org.koin.dsl.module

internal val repositoryModule = module {
    single<CategoriesRepository> { CategoriesRepositoryImpl(get(),get()) }
    single<RecipesRepository> { RecipesRepositoryImpl(get(),get(),get()) }
}