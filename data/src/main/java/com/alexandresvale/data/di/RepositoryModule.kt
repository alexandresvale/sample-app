package com.alexandresvale.data.di

import com.alexandresvale.data.PokemonRepositoryImpl
import com.alexandresvale.data.datasource.local.di.localDataSourceModule
import com.alexandresvale.data.datasource.remote.di.remoteDataSourceModule
import com.alexandresvale.domain.repository.PokemonRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<PokemonRepository> {
        PokemonRepositoryImpl(
            remoteDataSource = get(),
            localDataSource = get()
        )
    }
}

val dataModules = listOf(remoteDataSourceModule, localDataSourceModule, repositoryModule)