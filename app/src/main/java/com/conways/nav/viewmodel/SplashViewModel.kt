package com.conways.nav.viewmodel

import androidx.lifecycle.ViewModel
import com.conways.nav.data.SpRepository

/**
 *@author Zong
 *Created on 2020/5/25
 *Describe:
 */
class SplashViewModel : ViewModel() {


    var timeLeft = 5.toString()


    fun hasLogin(): Boolean {
        return SpRepository.getInstance().hasLogin()
    }


}