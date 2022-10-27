package com.example.fkn_labs_2022.domain.model

data class Character(
    var id: Int,
    val name: String,
    val description: String,
    val image: Int,
    val link : String
)