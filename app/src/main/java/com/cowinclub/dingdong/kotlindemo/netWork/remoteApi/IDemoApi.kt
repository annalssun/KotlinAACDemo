package com.cowinclub.dingdong.kotlindemo.netWork.remoteApi

import com.cowinclub.dingdong.kotlindemo.data.TestBean
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface IDemoApi {

    @GET("/satinApi")
    fun getSampleData(@Query("type") type: Int, @Query("page") page: Int): Flowable<TestBean>
}