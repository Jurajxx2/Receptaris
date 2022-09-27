package com.trasim.data.model.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "favourites")
data class FavouriteLocal(
    @PrimaryKey(autoGenerate = true)
    val favouriteId: Int,
    val recipeReference: String
)