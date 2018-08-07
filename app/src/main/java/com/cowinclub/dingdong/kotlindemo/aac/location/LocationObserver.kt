package com.cowinclub.dingdong.kotlindemo.aac.location

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.content.Context
import android.util.Log
import com.cowinclub.dingdong.kotlindemo.base.BaseLifeCycleObserver

class LocationObserver : BaseLifeCycleObserver {
    constructor(context: Context, lifecycle: Lifecycle) {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun onStart() {
        Log.v("LifeCycle","===============================onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private fun disConnect() {
        Log.v("LifeCycle","===============================onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun onResume(){
        Log.v("LifeCycle","===============================onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun onDistroy(){
        Log.v("LifeCycle","===============================onDistroy")
    }
}