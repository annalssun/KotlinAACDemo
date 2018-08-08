package com.cowinclub.dingdong.kotlindemo.data

import android.arch.persistence.room.TypeConverter
import android.text.TextUtils

class Converters {
    @TypeConverter
     fun arrayToString(array: Array<String>): String {
        if (array.size == 0) return ""
        val builder = StringBuilder(array[0])
        for (i in 1 until array.size)
            builder.append(array[i])
        return builder.toString()
    }

    @TypeConverter
    fun strToArray(str:String):Array<String>?{
        return if (TextUtils.isEmpty(str)) null else str.split(",").toTypedArray()
    }
}