package com.alexandresvale.data

import com.alexandresvale.data.datasource.remote.model.PokemonResultResponse
import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

interface PokemonRemoteDataSource {
    fun fetchPokemons() : Single<List<Pokemon>>
}