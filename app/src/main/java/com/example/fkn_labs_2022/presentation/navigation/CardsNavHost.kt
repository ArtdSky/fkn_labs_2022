package com.example.fkn_labs_2022

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fkn_labs_2022.presentation.screens.home.Home
import com.example.fkn_labs_2022.presentation.navigation.NavRoute
import com.example.fkn_labs_2022.presentation.screens.character.detail.CharacterDetail

@Composable
fun CardsNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.MainScreen.route) {
        composable(route = NavRoute.MainScreen.route) {
            Home(navController = navController)
        }
        composable(
            NavRoute.CharacterDetail.route + "/{Id}"

        ) { backStackEntry ->
            CharacterDetail(
                navController = navController,
                characterId = backStackEntry.arguments?.getString("Id")
            )
        }
    }
}

