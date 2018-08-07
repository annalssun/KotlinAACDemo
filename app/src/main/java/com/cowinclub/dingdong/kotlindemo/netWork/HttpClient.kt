package com.cowinclub.dingdong.kotlindemo.netWork

import retrofit2.Retrofit

public class HttpClient private constructor() {

    private lateinit var retrofit: Retrofit

    companion object {
        val instance = SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder = HttpClient()
    }

    fun getRetrofit(): Retrofit? {
        return retrofit
    }

}