package com.cowinclub.dingdong.kotlindemo.aac.roomDataBase

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.cowinclub.dingdong.kotlindemo.data.LocationBean

@Database(entities = arrayOf(LocationBean::class), version = 1, exportSchema = false)
abstract class MyDataBase : RoomDatabase() {

    companion object {
        private val DB_NAME: String = "DataBase.db"
        @Volatile
        private var instance: MyDataBase? = null

        @Synchronized
        fun getInstance(context:Context):MyDataBase{
            if (instance == null){
                instance = create(context)
            }
            return instance as MyDataBase
        }

        private fun create(context: Context):MyDataBase{
            return Room.databaseBuilder(context,MyDataBase::class.java, DB_NAME)
                    .allowMainThreadQueries()
                    .build()
        }
    }


}