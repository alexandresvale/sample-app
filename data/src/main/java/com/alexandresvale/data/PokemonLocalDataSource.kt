package com.alexandresvale.data

import androidx.lifecycle.LiveData
import com.alexandresvale.data.datasource.remote.model.PokemonResponse
import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

interface PokemonLocalDataSource {
    fun getPokemon(): Single<List<Pokemon>>
    fun insertAll(pokemonList: List<Pokemon>): Unit
    fun updateData(pokemonList: List<Pokemon>): Unit
}