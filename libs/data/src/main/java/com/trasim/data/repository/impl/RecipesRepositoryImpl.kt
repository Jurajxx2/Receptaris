package com.trasim.data.repository.impl

import com.trasim.data.api.api.RecipesApi
import com.trasim.data.database.dao.FavouritesDao
import com.trasim.data.database.dao.RecipesDao
import com.trasim.data.model.Recipe
import com.trasim.data.model.local.FavouriteLocal
import com.trasim.data.model.transformations.fromLocal
import com.trasim.data.model.transformations.fromRemote
import com.trasim.data.model.transformations.toLocal
import com.trasim.data.repository.RecipesRepository
import com.trasim.utils.Resource
import com.trasim.utils.networkBoundResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class RecipesRepositoryImpl(
    private val recipesDao: RecipesDao,
    private val favouritesDao: FavouritesDao,
    private val recipesApi: RecipesApi
) : RecipesRepository {

    override fun getFavouriteRecipes() = flow {
        emit(Resource.loading(null))
        emitAll(favouritesDao.getFavouriteRecipes()
            .map { Resource.success(it.map { it.meal.fromLocal() }) })
    }

    override suspend fun addRecipeToFavourites(recipeId: String) {
        favouritesDao.addToFavourites(FavouriteLocal(recipeReference = recipeId))
    }

    override suspend fun removeRecipeFromFavourites(recipeId: String) {
        favouritesDao.deleteByRecipeId(recipeId)
    }

    override fun getRecipesByCategory(category: String): Flow<Resource<List<Recipe>>> {
        return networkBoundResource(query = {
            recipesDao.getRecipesByCategoryId(category).map { it.map { it.fromLocal() } }
        }, fetch = {
            recipesApi.getRecipesByCategory(category).meals
        }, saveFetchResult = {
            recipesDao.insert(it.map { it.toLocal() })
        }, shouldFetch = {
            true
        })
    }

    override fun getRandomRecipe() = flow<Resource<Recipe?>> {
        emit(Resource.loading(null))
        val result = recipesApi.getRandomRecipe().meals.firstOrNull()
        if (result != null) {
            emit(Resource.success(result.fromRemote()))
            recipesDao.insert(result.toLocal())
        }
    }


}