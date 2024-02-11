package com.alexandresvale.data.datasource.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alexandresvale.domain.model.Ability

@Entity(tableName = "pokemon")
data class PokemonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String = "",
)
