package com.dizzastuh.winterval.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dizzastuh.winterval.user.User
import com.dizzastuh.winterval.user.UserDao

class Database {

    @Database(entities = [User::class], version = 1)

    abstract class AppDatabase : RoomDatabase() {
        abstract fun userDao(): UserDao
    }
}