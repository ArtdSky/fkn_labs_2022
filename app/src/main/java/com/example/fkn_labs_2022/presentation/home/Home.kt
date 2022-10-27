package com.example.fkn_labs_2022.presentation

import androidx.compose.runtime.Composable
import com.example.fkn_labs_2022.presentation.character.CharacterBox

@Composable
fun Home() {
    com.example.fkn_labs_2022.presentation.screens.background.Background()
    com.example.fkn_labs_2022.presentation.screens.logo.Logo()
    CharacterBox()
}