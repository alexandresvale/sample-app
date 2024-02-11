package com.alexandresvale.domain.repository

import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

interface PokemonRepository {
    fun getPokemons(forceUpdate: Boolean) : Single<List<Pokemon>>
}