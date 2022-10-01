package com.trasim.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Ingredient(val name: String?, val measure: String? = null)