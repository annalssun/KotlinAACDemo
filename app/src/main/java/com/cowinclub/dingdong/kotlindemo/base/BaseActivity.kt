package com.cowinclub.dingdong.kotlindemo.base

import android.app.Activity
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View



abstract class BaseActivity : AppCompatActivity(),LifecycleOwner {
    protected lateinit var  mLifecycleRegistry: LifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mLifecycleRegistry = LifecycleRegistry(this)
        mLifecycleRegistry.markState(Lifecycle.State.CREATED)
        setContentView(getLayoutId())
    }

    /*返回布局ID*/
    abstract fun getLayoutId(): Int

    fun registLifecycleObserver(lifeCycleObserver:BaseLifeCycleObserver){
        mLifecycleRegistry.addObserver(lifeCycleObserver)
    }



    fun <V : View> bindView(id: Int): Lazy<V> = lazy {
        viewFinder(id) as V
    }

    private val viewFinder: Activity.(Int) -> View?
        get() = { findViewById(it) }

    override fun onStart() {
        super.onStart()
        mLifecycleRegistry.markState(Lifecycle.State.STARTED)
    }

    override fun onResume() {
        super.onResume()
        mLifecycleRegistry.markState(Lifecycle.State.RESUMED)
    }

    override fun onDestroy() {
        super.onDestroy()
        mLifecycleRegistry.markState(Lifecycle.State.DESTROYED)
    }


}
