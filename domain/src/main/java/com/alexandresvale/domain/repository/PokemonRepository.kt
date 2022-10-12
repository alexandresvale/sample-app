package com.alexandresvale.domain.repository

import com.alexandresvale.domain.model.Pokemon

interface PokemonRepository {
    fun fetchPokemons(forceUpdate: Boolean) : List<Pokemon>
}