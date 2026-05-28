package com.app.ocdtracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "thoughts")
data class ThoughtEntry(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val thoughtText: String,
    val triggerText: String?,
    val timestamp: Long = System.currentTimeMillis()
)
