package com.alexandresvale.data

import com.alexandresvale.domain.model.Pokemon
import com.alexandresvale.domain.repository.PokemonRepository
import io.reactivex.Single

class PokemonRepositoryImpl(
    private val remoteDataSource: PokemonRemoteDataSource,
    private val localDataSource: PokemonLocalDataSource
): PokemonRepository {

    override fun getPokemons(forceUpdate: Boolean): Single<List<Pokemon>> {
        return  if (forceUpdate) {
            getPokemonRemote(forceUpdate)
        } else {
            localDataSource.getPokemon()
                .flatMap { listPokemon ->
                    when {
                        listPokemon.isEmpty() ->getPokemonRemote(forceUpdate)
                        else -> Single.just(listPokemon)
                    }
                }
        }
    }

    private fun getPokemonRemote(forceUpdate: Boolean): Single<List<Pokemon>> {
        return remoteDataSource.fetchPokemons()
            .flatMap { listPokemons ->
                if (forceUpdate) {
                    localDataSource.updateData(listPokemons)
                } else {
                    localDataSource.insertAll(listPokemons)
                }
                Single.just(listPokemons)
            }
    }

}