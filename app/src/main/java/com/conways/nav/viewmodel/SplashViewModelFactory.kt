package com.conways.nav.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 *@author Zong
 *Created on 2020/5/25
 *Describe:
 */
class SplashViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SplashViewModel() as T;
    }
}