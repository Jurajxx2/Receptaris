package com.trasim.dashboard.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.trasim.dashboard.usecase.GetRandomRecipeUseCase
import com.trasim.data.model.Recipe
import com.trasim.utils.Resource
import com.trasim.utils.Status
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class DashboardViewModel(private val getRandomRecipeUseCase: GetRandomRecipeUseCase): ViewModel() {

    init {
        getRandomRecipe()
    }

    private val randomRecipe = MutableStateFlow<Resource<Recipe?>>(Resource.loading(null))
    val state: Flow<DashboardState> = randomRecipe.map {
        when(it.status) {
            Status.LOADING -> {
                DashboardState(isLoading = true, null)
            }
            Status.ERROR -> {
                DashboardState(isLoading = false, null, true)
            }
            Status.SUCCESS -> {
                DashboardState(isLoading = true, it.data)
            }
        }
    }

    private fun getRandomRecipe() {
        viewModelScope.launch(Dispatchers.IO) {
            getRandomRecipeUseCase.execute().collect {
                randomRecipe.emit(it)
            }
        }
    }

    data class DashboardState(
        val isLoading: Boolean = false,
        val randomRecipe: Recipe?,
        val isError: Boolean = false
    )
}