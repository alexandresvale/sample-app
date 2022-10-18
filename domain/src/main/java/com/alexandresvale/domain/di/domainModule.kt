package com.alexandresvale.domain.di

import com.alexandresvale.domain.useCase.GetPokemonUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory {
        GetPokemonUseCase(
            repository = get()
        )
    }
}

val domainModule = listOf(useCaseModule)