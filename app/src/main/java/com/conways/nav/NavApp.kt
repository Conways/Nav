package com.conways.nav

import android.app.Application
import android.content.Context

/**
 *@author Zong
 *Created on 2020/5/25
 *Describe:
 */
class NavApp : Application() {


    override fun onCreate() {
        super.onCreate()
        _context = this
    }

    companion object {
        var  _context:Application? = null
        fun getContext(): Context {
            return _context!!
        }

    }






}