package com.alexandresvale.data.datasource.local.mapper

import com.alexandresvale.data.datasource.local.model.PokemonEntity
import com.alexandresvale.data.datasource.remote.model.PokemonResponse
import com.alexandresvale.domain.model.Pokemon

object PokemonLocalMapper {

    fun mapToDomain(pokemons: List<PokemonEntity>) = pokemons.map {
        Pokemon(name = it.name)
    }

    fun mapToLocal(pokemons: List<Pokemon>) = pokemons.map {
        PokemonEntity(
            name = it.name
        )
    }

}
