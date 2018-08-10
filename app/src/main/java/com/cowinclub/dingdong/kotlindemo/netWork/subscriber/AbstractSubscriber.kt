package com.cowinclub.dingdong.kotlindemo.netWork.subscriber

import org.reactivestreams.Subscriber

abstract class AbstractSubscriber<T> : Subscriber<T> {
    override fun onComplete() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNext(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(t: Throwable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}