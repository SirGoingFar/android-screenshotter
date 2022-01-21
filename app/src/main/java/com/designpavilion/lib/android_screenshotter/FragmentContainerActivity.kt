package com.designpavilion.lib.android_screenshotter

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.NavigationRes
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

open class FragmentContainerActivity : AppCompatActivity(R.layout.activity_fragment_container) {

    open val defaultStartDestination = R.id.screenOneFragment
    open val navGraphId = R.navigation.nav_graph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setNavigationGraph(
            navGraphId,
            intent.getIntExtra(START_DESTINATION, defaultStartDestination)
        )
    }

    private fun setNavigationGraph(@NavigationRes navGraphId: Int, @IdRes startDestinationId: Int) {
        val navHost =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHost.navController
        val navGraph = navController.navInflater.inflate(navGraphId)
        navGraph.startDestination = startDestinationId
        navController.setGraph(navGraph, intent.extras)
    }

    companion object {
        const val START_DESTINATION = "start_destination"
    }

}