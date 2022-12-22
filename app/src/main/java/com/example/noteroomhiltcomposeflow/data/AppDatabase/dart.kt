package com.example.noteroomhiltcomposeflow.data.AppDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.noteroomhiltcomposeflow.data.NoteDao
import com.example.noteroomhiltcomposeflow.model.NoteEntity


@Database(entities = [NoteEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){

    abstract fun noteDao() :NoteDao

    companion object{
        private var INSTANCE: AppDatabase?= null
        fun getInstance(context:Context):AppDatabase{
            if(INSTANCE == null){
                INSTANCE=  Room.databaseBuilder(context, AppDatabase::class.java,"note.db")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE as AppDatabase

        }
    }
}
