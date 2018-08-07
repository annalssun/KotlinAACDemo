package com.cowinclub.dingdong.kotlindemo

import android.app.Activity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.widget.TextView
import com.cowinclub.dingdong.kotlindemo.base.BaseActivity
import com.cowinclub.dingdong.kotlindemo.aac.location.LocationObserver
import com.cowinclub.dingdong.kotlindemo.aac.location.LocationViewModel
import com.cowinclub.dingdong.kotlindemo.data.LocationBean

class LocationActivity :BaseActivity(){

    lateinit var mLocationViewModel:LocationViewModel

    val mLocationTv by bindView<TextView>(R.id.location_tv)
    override fun initView() {
        mLocationViewModel= ViewModelProviders.of(this).get(LocationViewModel::class.java)

        var observer=object:Observer<LocationBean>{
            override fun onChanged(t: LocationBean?) {
                mLocationTv.setText(t?.cityName)
            }

        }
        mLocationViewModel.getCurrentLocation().observe(this,observer)
    }



    override fun getLayoutId(): Int {
        registLifecycleObserver(LocationObserver(this, mLifecycleRegistry))//注册lifecycle
        return R.layout.activity_location
    }


}