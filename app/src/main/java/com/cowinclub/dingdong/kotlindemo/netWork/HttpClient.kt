package com.cowinclub.dingdong.kotlindemo.netWork

import com.google.gson.Gson
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

public class HttpClient private constructor() {

    init {//生成实例的时候创建Retrofit
        buildRetrofit()
    }

    private lateinit var retrofit: Retrofit

    companion object {
        val instance = SingletonHolder.holder

        fun <T> toSubscribeOnIoThread(flowable: Flowable<T>):Flowable<T>{
            return flowable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .unsubscribeOn(Schedulers.io())
        }
    }

    private object SingletonHolder {
        val holder = HttpClient()
    }

    fun getRetrofit(): Retrofit {
        return retrofit
    }

    fun buildRetrofit() {
        val builder: OkHttpClient.Builder = OkHttpClient.Builder()
        builder.connectTimeout(30, TimeUnit.SECONDS)
        builder.readTimeout(30, TimeUnit.SECONDS)
        builder.writeTimeout(30, TimeUnit.SECONDS)

        retrofit = Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("")
                .build()

    }


}