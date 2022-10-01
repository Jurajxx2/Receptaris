package com.trasim.data.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName

@Entity(tableName = "categories")
class CategoryLocal(
    @PrimaryKey
    val categoryId: String,
    val category: String?,
    val categoryDescription: String?,
    val categoryThumb: String?
)