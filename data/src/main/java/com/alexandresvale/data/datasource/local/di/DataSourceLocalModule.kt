package com.alexandresvale.data.datasource.local.di

import com.alexandresvale.data.PokemonLocalDataSource
import com.alexandresvale.data.datasource.local.database.PokemonDataBase
import com.alexandresvale.data.datasource.local.source.PokemonLocalDataSourceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val localDataSourceModule = module {
    single {
        PokemonDataBase.createDataBase(androidContext())
            .pokemonDao()
    }

    factory<PokemonLocalDataSource> {
        PokemonLocalDataSourceImpl(
            pokemonDAO = get()
        )
    }
}