package com.trasim.data.database

import androidx.room.Room
import org.koin.dsl.module
import retrofit2.Retrofit

internal val databaseModule = module {

    single {
        Room.databaseBuilder(
            get(),
            ReceptarisDatabase::class.java,
            "Recipes.db"
        ).build()
    }

    single { get<ReceptarisDatabase>().recipesDao() }
    single { get<ReceptarisDatabase>().favouritesDao() }
    single { get<ReceptarisDatabase>().categoriesDao() }
}