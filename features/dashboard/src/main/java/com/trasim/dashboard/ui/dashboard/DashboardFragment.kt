package com.trasim.dashboard.ui.dashboard

import androidx.lifecycle.lifecycleScope
import com.trasim.base.fragment.BaseFragment
import com.trasim.dashboard.R
import com.trasim.dashboard.databinding.FragmentDashboardBinding
import kotlinx.coroutines.flow.collect
import org.koin.androidx.viewmodel.ext.android.viewModel

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {

    private val viewModel by viewModel<DashboardViewModel>()

    override fun setupUI() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.state.collect {

            }
        }
    }
}