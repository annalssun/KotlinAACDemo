package com.cowinclub.dingdong.kotlindemo.aac.location

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.cowinclub.dingdong.kotlindemo.data.LocationBean

class LocationViewModel:ViewModel(){
    lateinit var mCurrentLocation:MutableLiveData<LocationBean>

    fun getCurrentLocation():MutableLiveData<LocationBean>{
        return mCurrentLocation?:MutableLiveData<LocationBean>()
    }
}