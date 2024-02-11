package com.alexandresvale.domain.model

data class Pokemon(
    val name: String = "",
    val abilities: List<Ability> = emptyList()
)

data class Ability(
    val name: String = "",
    val url: String = ""
)