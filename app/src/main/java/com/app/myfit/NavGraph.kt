package com.app.myfit

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.myfit.screen.ListScreen
import com.app.myfit.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController
           ,startDestination = RouteNavigation.Main.route)
    {
        composable(
            route = RouteNavigation.Main.route
        ) {
            MainScreen(name = ":)")
        }

        composable(
            route = RouteNavigation.List.route
        ) {
            ListScreen(name = "List")
        }
    }
}