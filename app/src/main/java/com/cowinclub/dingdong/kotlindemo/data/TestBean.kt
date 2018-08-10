package com.cowinclub.dingdong.kotlindemo.data

data class TestBean(var code:String,var msg:String,var data:List<Data>)

data class Data(var text:String,var profile_name:String)