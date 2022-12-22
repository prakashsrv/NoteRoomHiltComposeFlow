package com.example.noteroomhiltcomposeflow.data

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.noteroomhiltcomposeflow.model.NoteEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    @Query("select * from note")
    fun getAllFlow(): Flow<List<NoteEntity>>

    @Insert
    fun insert(note : NoteEntity)

    @Delete
    fun delete(note : NoteEntity)

    @Update
    fun update(note : NoteEntity)


}