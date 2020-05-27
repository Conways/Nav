package com.conways.nav.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.conways.nav.R
import com.conways.nav.data.SpRepository
import com.conways.statusbar.StatusBar
import com.conways.statusbar.StatusBarType

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setStateBar()
        findViewById<TextView>(R.id.activity_login_login).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            SpRepository.getInstance().setHasLogin(true)
            finish()
        }
    }


    //设置状态栏
    private fun setStateBar() {
        StatusBar(this).apply {
            isDarkModel = true
            type = StatusBarType.Normal
            color = ActivityCompat.getColor(this@LoginActivity, R.color.colorBlue)
        }.commit()
    }

}
