package com.trasim.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.trasim.data.database.dao.CategoriesDao
import com.trasim.data.database.dao.FavouritesDao
import com.trasim.data.database.dao.RecipesDao
import com.trasim.data.model.local.CategoryLocal
import com.trasim.data.model.local.FavouriteLocal
import com.trasim.data.model.local.RecipeLocal

const val DATABASE_VERSION = 1

@Database(
    entities = [
        FavouriteLocal::class,
        RecipeLocal::class,
        CategoryLocal::class,
    ],
    version = DATABASE_VERSION,
    exportSchema = true
)
@TypeConverters(PropertyTypeConverters::class)
abstract class ReceptarisDatabase : RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

    abstract fun favouritesDao(): FavouritesDao

    abstract fun categoriesDao(): CategoriesDao
}

class PropertyTypeConverters {

    @TypeConverter
    fun fromStringList(list: List<String?>?): String? {
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toStringList(json: String?): List<String?>? {
        val listType = object : TypeToken<ArrayList<String>>() {}.type
        return Gson().fromJson(json, listType)
    }
}