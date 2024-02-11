package com.alexandresvale.data.datasource.remote.model

import com.alexandresvale.domain.model.Pokemon
import com.google.gson.annotations.SerializedName

data class PokemonResultResponse(
    @SerializedName("results")
    val results: List<PokemonResponse> = emptyList()
)

data class PokemonResponse(
    @SerializedName("name")
    val name: String = ""
)
