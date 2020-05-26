package com.conways.nav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.conways.nav.R
import com.conways.nav.databinding.FragmentSplashBinding
import com.conways.nav.viewmodel.SplashViewModel

class SplashFragment : BaseFragment() {

    lateinit var model: SplashViewModel
    lateinit var binding: FragmentSplashBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = ViewModelProvider(this)[SplashViewModel::class.java]
    }


    override fun statusBarColor(): Int {
        return 0xfffbbc05.toInt()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_splash, container, false)
        binding.vm=model
        binding.fragmentSplashBt.setOnClickListener { it.findNavController().navigate(R.id.action_spalshFragment_to_loginFragment) }
        return binding.root
    }

}
