package com.grigorevmp.myowndino.common.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.grigorevmp.myowndino.R
import com.grigorevmp.myowndino.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return
        val navController = navHostFragment.navController

        setUpBottomNav(navController, this)
    }
}

fun setUpBottomNav(navController: NavController, mainActivity: MainActivity) {
    binding.bottomTabBar.setupWithNavController(navController)

    binding.bottomTabBar.setOnItemSelectedListener { item ->
        NavigationUI.onNavDestinationSelected(
            item,
            Navigation.findNavController(mainActivity, R.id.my_nav_host_fragment)
        )
    }
}