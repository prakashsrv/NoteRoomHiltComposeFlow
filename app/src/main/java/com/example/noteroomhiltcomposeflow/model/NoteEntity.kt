package com.example.noteroomhiltcomposeflow.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "note")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true) val roomId: Long? = null,
    val text: String,
)