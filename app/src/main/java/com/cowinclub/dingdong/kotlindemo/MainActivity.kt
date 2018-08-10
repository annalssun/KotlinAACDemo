package com.cowinclub.dingdong.kotlindemo

import android.widget.TextView
import com.cowinclub.dingdong.kotlindemo.aac.location.LocationObserver
import com.cowinclub.dingdong.kotlindemo.base.BaseActivity
import com.cowinclub.dingdong.kotlindemo.data.Student

class MainActivity : BaseActivity() {

    val mTextView by bindView<TextView>(R.id.tv)


    override fun initView() {
    }

    override fun getLayoutId(): Int {
        registLifecycleObserver(LocationObserver(this, mLifecycleRegistry))
        return R.layout.activity_main
    }

    fun test() {
        var student = Student(123456,"Tom")

        GsonFactory.jsonFromString<Student>("")

    }

}
