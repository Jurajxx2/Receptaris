package com.trasim.data.repository.impl

import com.trasim.data.api.api.CategoriesApi
import com.trasim.data.database.dao.CategoriesDao
import com.trasim.data.model.Category
import com.trasim.data.model.transformations.fromLocal
import com.trasim.data.model.transformations.fromRemote
import com.trasim.data.model.transformations.toLocal
import com.trasim.data.repository.CategoriesRepository
import com.trasim.utils.Resource
import com.trasim.utils.networkBoundResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class CategoriesRepositoryImpl(
    private val categoriesDao: CategoriesDao,
    private val categoriesApi: CategoriesApi
) : CategoriesRepository {

    override fun getCategories(): Flow<Resource<List<Category>>> {
        return networkBoundResource(
            query = {
                categoriesDao.getAllCategories().map { it.map { it.fromLocal() } }
            },
            fetch = {
                categoriesApi.getCategories().categories
            },
            saveFetchResult = {
                categoriesDao.insert(it.map { it.toLocal() })
            }
        )
    }
}