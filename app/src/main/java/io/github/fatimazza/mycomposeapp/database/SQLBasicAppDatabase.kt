package io.github.fatimazza.mycomposeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.github.fatimazza.mycomposeapp.database.email.Email
import io.github.fatimazza.mycomposeapp.database.email.EmailDao

@Database(entities = arrayOf(Email::class), version = 1)
abstract class SQLBasicAppDatabase: RoomDatabase() {
    abstract fun emailDao(): EmailDao

    companion object {
        @Volatile
        private var INSTANCE: SQLBasicAppDatabase? = null

        fun getDatabase(
            context: Context
        ): SQLBasicAppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    SQLBasicAppDatabase::class.java,
                    "sql_app_database"
                )
                    .createFromAsset("database/Email.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}
