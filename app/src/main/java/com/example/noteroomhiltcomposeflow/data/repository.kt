package com.example.noteroomhiltcomposeflow.data

import com.example.noteroomhiltcomposeflow.model.NoteEntity
import kotlinx.coroutines.flow.Flow

class NoteRepository(
    private val noteDao: NoteDao
) {

    fun getAllFlow(): Flow<List<NoteEntity>> = noteDao.getAllFlow()
    fun insert(note:NoteEntity) = noteDao.insert(note=note);
    fun update(note:NoteEntity) = noteDao.update(note=note);
    fun delete(note:NoteEntity) = noteDao.delete(note=note);



}