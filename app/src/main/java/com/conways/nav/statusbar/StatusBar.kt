package com.conways.statusbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity

/**
 *@author Zong
 *Created on 2019/10/18
 *Describe:
 */
class StatusBar(context: FragmentActivity) {

    private var context = context;

    var isDarkModel = false

    var type = StatusBarType.Normal;

    var color = Color.TRANSPARENT;


    fun commit() {
        StatusBarHelper.Transparent(context, type, color);
        if (isDarkModel) {
            StatusBarHelper.SetTextStyleDark(context)
        }
    }


}