package com.conways.nav.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController

import com.conways.nav.R
import com.conways.statusbar.StatusBar
import com.conways.statusbar.StatusBarType

class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activity?.let {
            StatusBar(it).apply {
                isDarkModel = true;
                type = StatusBarType.Normal
                color = 0xffffffff.toInt()

            }.commit()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_login, container, false);
//        view.findViewById<TextView>(R.id.fragment_login_bt).setOnClickListener {
//
//            view.findNavController().navigate(R.id.action_loginFragment_to_nav_match)
//
//        }
        return view
    }
}
