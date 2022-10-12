package com.alexandresvale.domain.di

import com.alexandresvale.domain.useCase.FetchPokemonUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory {
        FetchPokemonUseCase(
            repository = get()
        )
    }
}

val domainModule = listOf(useCaseModule)