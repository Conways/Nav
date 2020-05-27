package com.conways.nav.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.conways.nav.databinding.FragmentSplashBinding
import com.conways.nav.viewmodel.SplashViewModel
import com.conways.statusbar.StatusBar
import com.conways.statusbar.StatusBarType

class SplashActivity : AppCompatActivity() {

    lateinit var model: SplashViewModel
    lateinit var binding: FragmentSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStatuBar()
        init()
    }

    //初始化mvvm
    fun init() {
        binding = FragmentSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        model = ViewModelProvider(this)[SplashViewModel::class.java]
        lifecycle.addObserver(model)
        binding.vm = model


        val timeObserver = Observer<Int> {
            binding.fragmentSplashBt.text = it.toString() + "s"
            if (0 == it) {
                toTargetByLoginStatus()
            }
        }
        model.timeLeft.observe(this, timeObserver)
        model.startCountDownTime()

        binding.fragmentSplashBt.setOnClickListener {

            toTargetByLoginStatus()
        }
    }

    fun toTargetByLoginStatus() {
        startActivity(
            Intent(
                this,
                if (model.hasLogin()) MainActivity::class.java else LoginActivity::class.java
            )
        )

        finish()
    }


    //设置状态栏
    fun setStatuBar() {
        StatusBar(this).apply {
            isDarkModel = true
            type = StatusBarType.Normal
            color = 0xfffbbc05.toInt()
        }.commit()
    }
}
