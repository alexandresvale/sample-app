package com.alexandresvale.data.datasource.remote.source

import com.alexandresvale.data.PokemonRemoteDataSource
import com.alexandresvale.data.datasource.remote.api.PokemonService
import com.alexandresvale.data.datasource.remote.mapper.PokemonRemoteMapper
import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

class PokemonRemoteDataSourceImpl(
    val pokemonService: PokemonService
) : PokemonRemoteDataSource {
    override fun fetchPokemons(): Single<List<Pokemon>> {
        return pokemonService.fetchsPokemons().map {
            PokemonRemoteMapper.mapToDomain(it)
        }
    }

}