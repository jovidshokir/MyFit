package com.app.myfit

sealed class RouteNavigation(val route: String) {
    object Main: RouteNavigation(route = "main")
    object List: RouteNavigation(route = "list")

}
