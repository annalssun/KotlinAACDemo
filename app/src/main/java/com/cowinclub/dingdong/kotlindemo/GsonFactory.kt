package com.cowinclub.dingdong.kotlindemo

import com.google.gson.Gson

object GsonFactory {
    inline fun <reified T> jsonFromString(jsonString: String): T? {
        return Gson().fromJson(jsonString, T::class.java)

    }
}