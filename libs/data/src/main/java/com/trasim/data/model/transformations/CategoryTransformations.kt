package com.trasim.data.model.transformations

import com.trasim.data.model.Category
import com.trasim.data.model.local.CategoryLocal
import com.trasim.data.model.remote.GetCategoriesResponse

fun CategoryLocal.fromLocal() = Category(categoryId, category, categoryDescription, categoryThumb)

fun GetCategoriesResponse.Category.fromRemote() =
    Category(idCategory, strCategory, strCategoryDescription, strCategoryThumb)

fun GetCategoriesResponse.Category.toLocal() =
    CategoryLocal(idCategory, strCategory, strCategoryDescription, strCategoryThumb)