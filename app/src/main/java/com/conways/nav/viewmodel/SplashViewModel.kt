package com.conways.nav.viewmodel

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.*
import com.conways.nav.data.SpRepository
import java.lang.ref.WeakReference

/**
 *@author Zong
 *Created on 2020/5/25
 *Describe:
 */


const val TIME = 5

class SplashViewModel : ViewModel(),LifecycleObserver{

    var timeDown = TimeDown(this)

    var timeLeft = MutableLiveData<Int>(TIME)

    var test="test"


    fun hasLogin(): Boolean {
        return SpRepository.getInstance().hasLogin()
    }

    fun getTimeLeft(): String? {
        return timeLeft.value?.toString()
    }


    fun startCountDownTime() {
        timeDown?.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun cancelCountDownTime() {
        timeDown?.cancel()
    }


    class TimeDown(vm: SplashViewModel) : CountDownTimer(
        TIME.toLong() * 1000L,
        1000L

    ) {
        private var wf = WeakReference<SplashViewModel>(vm)


        override fun onFinish() {

        }

        override fun onTick(millisUntilFinished: Long) {
            wf.get()?.timeLeft?.value = (millisUntilFinished / 1000L).toInt()
            Log.d("zzzzzzz", (millisUntilFinished / 1000L).toString())
        }


    }


}