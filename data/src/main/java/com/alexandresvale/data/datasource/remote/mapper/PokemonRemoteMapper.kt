package com.alexandresvale.data.datasource.remote.mapper

import com.alexandresvale.data.datasource.remote.model.PokemonResponse
import com.alexandresvale.data.datasource.remote.model.PokemonResultResponse
import com.alexandresvale.domain.model.Pokemon

object PokemonRemoteMapper {

    fun mapToDomain(pokemons: PokemonResultResponse) = pokemons.results.map {
        Pokemon(name = it.name)
    }


}