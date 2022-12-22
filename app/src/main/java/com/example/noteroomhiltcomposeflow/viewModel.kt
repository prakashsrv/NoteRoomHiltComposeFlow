package com.example.noteroomhiltcomposeflow

import androidx.lifecycle.ViewModel
import com.example.noteroomhiltcomposeflow.data.NoteRepository
import com.example.noteroomhiltcomposeflow.model.NoteEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow

interface HomeViewModelAbstract {

    val noteListFlow: Flow<List<NoteEntity>>
    fun addNote(note:NoteEntity)
    fun updateNote(note:NoteEntity)
    fun deleteNote(note:NoteEntity)

}
@HiltViewModel
class HomeViewModel constructor(
    private val noteRepository: NoteRepository
) :ViewModel(),HomeViewModelAbstract{
    override val noteListFlow: Flow<List<NoteEntity>> = noteRepository.getAllFlow()

    override fun addNote(note: NoteEntity) = noteRepository.insert(note = note)

    override fun updateNote(note: NoteEntity) = noteRepository.update(note = note)

    override fun deleteNote(note: NoteEntity) = noteRepository.delete( note = note)

}