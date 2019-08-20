package br.com.saraiva.roomwordsample.DAO

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.saraiva.roomwordsample.DAO.WordDao
import br.com.saraiva.roomwordsample.model.Word

@Database(entities = arrayOf(Word::class), version = 1)

abstract class WordRoomDatabase : RoomDatabase() {

    abstract fun wordDao(): WordDao
}
