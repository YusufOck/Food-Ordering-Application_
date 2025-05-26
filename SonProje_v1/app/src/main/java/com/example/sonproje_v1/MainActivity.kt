package com.example.sonproje_v1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.sonproje_v1.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        //NavigationUI.setupWithNavController(binding.bottomNav, navHostFragment.navController)

        // Custom bottom nav setup
        navController = navHostFragment.navController
        setupBottomNav()

    }

    private fun setupBottomNav() {
        binding.bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.anasayfaFragment -> {
                    if (navController.currentDestination?.id != R.id.anasayfaFragment) {
                        navController.popBackStack(R.id.anasayfaFragment, false)
                    }
                    true
                }

                R.id.sepetFragment -> {
                    if (navController.currentDestination?.id != R.id.sepetFragment) {
                        navController.navigate(R.id.sepetFragment)
                    }
                    true
                }

                else -> false
            }
        }
    }
    }



