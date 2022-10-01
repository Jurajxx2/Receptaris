package com.trasim.recipes.ui.list

import androidx.fragment.app.viewModels
import com.trasim.base.fragment.BaseFragment
import com.trasim.recipes.R
import com.trasim.recipes.databinding.FragmentRecipeDetailBinding
import com.trasim.recipes.databinding.FragmentRecipeListBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecipeListFragment: BaseFragment<FragmentRecipeListBinding>(R.layout.fragment_recipe_list) {

    private val viewModel by viewModel<RecipeListViewModel>()

    override fun setupUI() {

    }
}