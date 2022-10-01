package com.trasim.data

import com.trasim.data.api.apiModule
import com.trasim.data.database.databaseModule
import com.trasim.data.repository.repositoryModule

val dataModules = listOf(
    repositoryModule,
    databaseModule,
    apiModule
)