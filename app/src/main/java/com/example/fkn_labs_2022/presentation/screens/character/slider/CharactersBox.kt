package com.example.fkn_labs_2022.presentation.screens.character

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.fkn_labs_2022.data.CharactesData

@Composable
fun CharacterBox(navController: NavHostController) {
    Box(
        modifier = Modifier.padding(top = 150.dp)
    ) {
        CharactersList(characters = CharactesData.charactersData, navController = navController)
    }
}