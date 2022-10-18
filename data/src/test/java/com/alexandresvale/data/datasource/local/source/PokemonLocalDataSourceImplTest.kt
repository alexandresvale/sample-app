package com.alexandresvale.data.datasource.local.source

import com.alexandresvale.data.datasource.local.dao.PokemonDAO
import com.alexandresvale.data.datasource.local.database.PokemonDataBase
import com.alexandresvale.data.datasource.local.model.PokemonEntity
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class PokemonLocalDataSourceImplTest {

    private lateinit var pokemonDataBase: PokemonDataBase
    @Test
    fun `getPokemon deve retornar lista de dados`() = runBlocking {
        pokemonDataBase = mockk()
        val pokemonDAO = mockk<PokemonDAO>()
        val pokemonEntity = PokemonEntity(name = "Alexandre")
        every { pokemonDataBase.pokemonDao() } returns pokemonDAO
        coEvery { pokemonDAO.insert(any()) } returns Unit
        coEvery { pokemonDAO.getPokemons() } returns listOf(pokemonEntity)
        pokemonDAO.insert(pokemonEntity)

        val entity = pokemonDAO.getPokemons()[0]
        assertEquals(entity.name, pokemonEntity.name)
    }
}