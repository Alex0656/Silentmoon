package com.example.silentmoon.signing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.silentmoon.R

class SleepMusicV2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep_music_v2)
    }


    fun onClickGoBack(view: View){
        finish()
    }
}