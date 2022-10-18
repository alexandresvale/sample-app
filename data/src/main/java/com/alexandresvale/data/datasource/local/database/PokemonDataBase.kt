package com.alexandresvale.data.datasource.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.alexandresvale.data.datasource.local.dao.PokemonDAO
import com.alexandresvale.data.datasource.local.model.PokemonEntity

@Database(version = 1, exportSchema = false, entities = [PokemonEntity::class])
abstract class PokemonDataBase : RoomDatabase() {

    abstract fun pokemonDao() : PokemonDAO

    companion object {
        private var INSTANCE: PokemonDataBase? = null

        fun createDataBase(context: Context): PokemonDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PokemonDataBase::class.java,
                    "pokemon_database.db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}