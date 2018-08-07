package com.cowinclub.dingdong.kotlindemo

import com.cowinclub.dingdong.kotlindemo.base.BaseActivity

class LocationActivity :BaseActivity(){
    override fun getLayoutId(): Int {
        registLifecycleObserver(LocationObserver(this,mLifecycleRegistry))//注册lifecycle
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}