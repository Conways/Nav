package com.conways.nav.data

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.conways.nav.NavApp

/**
 *@author Zong
 *Created on 2020/5/25
 *Describe:
 */
class SpRepository private constructor() {


    private var sp = NavApp._context?.getSharedPreferences("nav_sp", Context.MODE_PRIVATE)


    companion object {
        private var spRepository: SpRepository? = null
        fun getInstance() = spRepository ?: synchronized(this) {
            spRepository ?: SpRepository().also { spRepository = it }
        }

    }


    fun hasLogin(): Boolean {
        return sp?.getBoolean("nav_sp_haslogin", false) ?: false
    }

    fun setHasLogin(hasLogin: Boolean) {
        var editor = sp?.edit()
        editor?.putBoolean("nav_sp_haslogin", hasLogin)
        editor?.commit()
    }
}