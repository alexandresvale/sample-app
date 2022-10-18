package com.alexandresvale.data.datasource.local.source

import com.alexandresvale.data.PokemonLocalDataSource
import com.alexandresvale.data.datasource.local.dao.PokemonDAO
import com.alexandresvale.data.datasource.local.mapper.PokemonLocalMapper
import com.alexandresvale.data.datasource.remote.model.PokemonResponse
import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

class PokemonLocalDataSourceImpl(
    private val pokemonDAO: PokemonDAO
) : PokemonLocalDataSource {

    override fun getPokemon(): Single<List<Pokemon>> {
        return pokemonDAO.getPokemons().map {
            PokemonLocalMapper.mapToDomain(it)
        }
    }

    override fun insertAll(pokemonList: List<Pokemon>) {
        pokemonDAO.insertAll(PokemonLocalMapper.mapToLocal(pokemonList))
    }

    override fun updateData(pokemonList: List<Pokemon>) {
        pokemonDAO.updateData(PokemonLocalMapper.mapToLocal(pokemonList))
    }

}