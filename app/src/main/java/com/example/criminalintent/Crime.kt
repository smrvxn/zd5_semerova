package com.example.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
    var title:String = "",
    var date: Date? = null,
    var isSolved: Boolean? = null,
    var _requiresPolice:Boolean = false)




