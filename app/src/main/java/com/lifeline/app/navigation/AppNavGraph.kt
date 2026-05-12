package com.lifeline.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lifeline.app.presentation.home.HomeScreen
import com.lifeline.app.presentation.map.HospitalMapScreen
import com.lifeline.app.presentation.sos.SOSScreen
import com.lifeline.app.presentation.splash.SplashScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("sos") { SOSScreen() }
        composable("map") { HospitalMapScreen() }
    }
}
