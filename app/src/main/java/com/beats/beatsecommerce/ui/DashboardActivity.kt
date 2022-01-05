package com.beats.beatsecommerce.ui

import android.os.Bundle
import com.beats.beatsecommerce.R
import com.beats.beatsecommerce.databinding.ActivityDashboardBinding
import com.beats.beatsecommerce.ui.fragments.HomeFragment
import com.beats.beatsecommerce.ui.fragments.MoreFragment
import com.beats.beatsecommerce.ui.fragments.ProfileFragment

class DashboardActivity : BaseActivity() {

    lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.bnvMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    loadFragment(HomeFragment.newInstance("", ""), true)
                }
                R.id.menu_profile -> {
                    loadFragment(ProfileFragment.newInstance("", ""), true)
                }
                R.id.menu_more -> {
                    loadFragment(MoreFragment.newInstance("", ""), true)
                }

            }
            true
        }

        binding.bnvMenu.selectedItemId = R.id.menu_home
    }

}