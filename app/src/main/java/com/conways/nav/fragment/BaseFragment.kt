package com.conways.nav.fragment

import androidx.fragment.app.Fragment
import com.conways.statusbar.StatusBar
import com.conways.statusbar.StatusBarType

/**
 *@author Zong
 *Created on 2020/5/26
 *Describe:
 */
open class BaseFragment : Fragment() {


    override fun onResume() {
        super.onResume()
        activity?.let {
            StatusBar(it).apply {
                isDarkModel = isDarkModel()
                type = statusBarType()
                color = statusBarColor()

            }.commit()
        }
    }


    open fun statusBarType(): StatusBarType {
        return StatusBarType.Normal
    }

    open fun statusBarColor(): Int {
        return 0xffffffff.toInt()
    }

    open fun isDarkModel(): Boolean {
        return true
    }


}