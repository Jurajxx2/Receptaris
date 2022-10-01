package com.trasim.receptaris

import android.app.Application
import com.trasim.dashboard.dashboardModules
import com.trasim.data.dataModules
import com.trasim.receptaris.activity.appModule
import com.trasim.recipes.recipesModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ReceptarisApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@ReceptarisApplication)
            modules(appModule)
            modules(dashboardModules)
            modules(recipesModules)
            modules(dataModules)
        }
    }
}