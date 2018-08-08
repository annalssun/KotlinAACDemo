package com.cowinclub.dingdong.kotlindemo.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "location")
data class LocationBean(@PrimaryKey(autoGenerate = true) var id:Int){
//    constructor():this(0)

    @ColumnInfo(name = "cityName")
    @SerializedName("cityName") var cityName:String =""

    @ColumnInfo(name = "provinceName")
    @SerializedName("provinceName") var provinceName:String=""
}