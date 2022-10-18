package com.alexandresvale.data.datasource.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Transaction
import com.alexandresvale.data.datasource.local.model.PokemonEntity
import com.alexandresvale.domain.model.Pokemon
import io.reactivex.Single

@Dao
interface PokemonDAO {

    @Insert(onConflict = REPLACE)
    fun insertAll(pokemonEntity: List<PokemonEntity>)

    @Insert(onConflict = REPLACE)
    fun insert(pokemonEntity: PokemonEntity)

    @Delete
    fun delete(pokemonEntity: PokemonEntity)

    @Query("DELETE FROM pokemon")
    fun deteleAll()

    @Query("SELECT * FROM pokemon")
    fun getPokemons(): Single<List<PokemonEntity>>

    @Transaction
    fun updateData(pokemonEntityList: List<PokemonEntity>) {
        deteleAll()
        insertAll(pokemonEntityList)
    }

}
