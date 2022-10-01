package com.trasim.recipes.ui.detail

import com.trasim.base.fragment.BaseFragment
import com.trasim.recipes.R
import com.trasim.recipes.databinding.FragmentRecipeDetailBinding
import com.trasim.recipes.databinding.FragmentRecipeListBinding
import com.trasim.recipes.ui.list.RecipeListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecipeDetailFragment: BaseFragment<FragmentRecipeDetailBinding>(R.layout.fragment_recipe_detail) {

    private val viewModel by viewModel<RecipeDetailViewModel>()

    override fun setupUI() {

    }
}