package com.alexandresvale.domain.useCase

import com.alexandresvale.domain.repository.PokemonRepository
import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

class GetPokemonUseCase(
    private val repository: PokemonRepository
) {

    fun invoke(forceUpdate: Boolean) : Single<List<Pokemon>> {
        return repository.getPokemons(forceUpdate = false)
    }

}