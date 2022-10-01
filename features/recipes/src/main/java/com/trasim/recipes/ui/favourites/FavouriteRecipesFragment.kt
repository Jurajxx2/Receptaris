package com.trasim.recipes.ui.favourites

import com.trasim.base.fragment.BaseFragment
import com.trasim.recipes.R
import com.trasim.recipes.databinding.FragmentFavouriteRecipesBinding
import com.trasim.recipes.databinding.FragmentRecipeListBinding
import com.trasim.recipes.ui.list.RecipeListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavouriteRecipesFragment: BaseFragment<FragmentFavouriteRecipesBinding>(R.layout.fragment_favourite_recipes) {

    private val viewModel by viewModel<FavouriteRecipesViewModel>()

    override fun setupUI() {

    }
}