package com.example.silentmoon.signing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowCompat
import com.example.silentmoon.R

class MusicV2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_v2)

        //WindowCompat.setDecorFitsSystemWindows(window, true)
    }

    fun onClickGoBack(view: View){
        finish()

    }

}