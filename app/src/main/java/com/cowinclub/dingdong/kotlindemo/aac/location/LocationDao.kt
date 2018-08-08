package com.cowinclub.dingdong.kotlindemo.aac.location

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.cowinclub.dingdong.kotlindemo.data.LocationBean

@Dao
interface LocationDao{

    @Query("SELECT * FROM location WHERE cityName = :cityName ")
    fun getCityByCityName(cityName:String):LocationBean
}