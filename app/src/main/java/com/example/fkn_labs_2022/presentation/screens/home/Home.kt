package com.example.fkn_labs_2022.presentation.screens.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.fkn_labs_2022.presentation.screens.background.Background
import com.example.fkn_labs_2022.presentation.screens.character.CharacterBox

@Composable
fun Home(navController: NavHostController) {
    Background()
    com.example.fkn_labs_2022.presentation.screens.logo.Logo()
    CharacterBox(navController = navController)
}