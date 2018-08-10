package com.cowinclub.dingdong.kotlindemo.netWork.remoteApi

import com.cowinclub.dingdong.kotlindemo.data.TestBean
import com.cowinclub.dingdong.kotlindemo.netWork.HttpClient
import io.reactivex.Flowable

class DemoApi{
    companion object {
        fun getDemoData(type:Int,page:Int):Flowable<TestBean>{
           val flowable:Flowable<TestBean> = HttpClient.instance.getRetrofit()
                   .create(IDemoApi::class.java).getSampleData(type,page)
            flowable.subscribe()

            return HttpClient.toSubscribeOnIoThread(flowable)
        }
    }
}
