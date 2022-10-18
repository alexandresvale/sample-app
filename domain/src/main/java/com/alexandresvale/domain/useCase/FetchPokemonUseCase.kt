package com.alexandresvale.domain.useCase

import com.alexandresvale.domain.repository.PokemonRepository
import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

class FetchPokemonUseCase(
    private val repository: PokemonRepository
) {

    fun invoke() : Single<List<Pokemon>> {
        return repository.getPokemons(forceUpdate = false)
    }

}