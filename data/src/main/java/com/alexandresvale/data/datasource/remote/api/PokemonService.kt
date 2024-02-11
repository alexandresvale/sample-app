package com.alexandresvale.data.datasource.remote.api

import com.alexandresvale.data.datasource.remote.model.PokemonResultResponse
import io.reactivex.Single
import retrofit2.http.GET

interface PokemonService {
    @GET("v2/pokemon/")
    fun fetchsPokemons(): Single<PokemonResultResponse>
}