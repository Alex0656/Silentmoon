package com.example.silentmoon.signing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.silentmoon.R

class WelcomeSleepActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_sleep)
    }

    fun onClickGoSleep(view: View){
        val intent = Intent(this, ManagerSleepActivity::class.java)
        startActivity(intent)
    }

}