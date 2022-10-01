package com.trasim.data.repository

import com.trasim.data.model.Category
import com.trasim.utils.Resource
import kotlinx.coroutines.flow.Flow

interface CategoriesRepository {
    fun getCategories(): Flow<Resource<List<Category>>>
}