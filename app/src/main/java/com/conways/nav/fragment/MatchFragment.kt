package com.conways.nav.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController

import com.conways.nav.R


class MatchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_match, container, false);
        view.findViewById<TextView>(R.id.fragment_match_bt).setOnClickListener {

            view.findNavController().navigate(R.id.action_matchFragment_to_inGameFragment)

        }
        return view
    }



}
