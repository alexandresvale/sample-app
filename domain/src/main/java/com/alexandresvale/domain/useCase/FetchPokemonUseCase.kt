package com.alexandresvale.domain.useCase

import com.alexandresvale.domain.repository.PokemonRepository
import com.alexandresvale.domain.model.Pokemon

class FetchPokemonUseCase(
    private val repository: PokemonRepository
) {

    fun invoke() : List<Pokemon> {
        return repository.fetchPokemons(forceUpdate = false)
    }

}