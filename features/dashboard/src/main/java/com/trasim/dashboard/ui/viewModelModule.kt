package com.trasim.dashboard.ui

import com.trasim.dashboard.ui.dashboard.DashboardViewModel
import org.koin.dsl.module

internal val viewModelModule = module {
    single { DashboardViewModel(get()) }
}