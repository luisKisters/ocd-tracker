package com.app.ocdtracker.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ThoughtDao {
    @Insert
    suspend fun insert(entry: ThoughtEntry)

    @Query("SELECT * FROM thoughts ORDER BY timestamp DESC")
    fun getAll(): Flow<List<ThoughtEntry>>

    @Query("SELECT COUNT(*) FROM thoughts")
    fun getCount(): Flow<Int>
}
