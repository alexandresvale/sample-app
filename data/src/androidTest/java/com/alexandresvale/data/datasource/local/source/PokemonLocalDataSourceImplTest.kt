package com.alexandresvale.data.datasource.local.source

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.alexandresvale.data.datasource.local.dao.PokemonDAO
import com.alexandresvale.data.datasource.local.database.PokemonDataBase
import com.alexandresvale.data.datasource.local.model.PokemonEntity
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PokemonLocalDataSourceImplTest {

    private lateinit var pokemonDAO: PokemonDAO
    private lateinit var dataBase: PokemonDataBase

    @Before
    fun setUp() {
        val contex = ApplicationProvider.getApplicationContext<Context>()
        dataBase = Room.inMemoryDatabaseBuilder(
            contex, PokemonDataBase::class.java,
        ).build()
        pokemonDAO = dataBase.pokemonDao()
    }

    @After
    fun tearDown() {
        dataBase.close()
    }

    @Test
    fun getPokemonShouldList() = runBlocking {
        //Given
        val pokemonEntity = PokemonEntity(name = "ale")
        pokemonDAO.insert(pokemonEntity)
        //When
        val pokemonEntityList = pokemonDAO.getPokemons()

        //Then
        assertEquals(pokemonEntity.name, pokemonEntityList.test())
    }


}