package com.example.silentmoon.signing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.silentmoon.R

class PlayOptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_option)
    }
    fun onClickGoPlay(view: View){
        val intent = Intent(this, SleepMusicV2Activity::class.java)
        startActivity(intent)
    }
    fun onClickGoBack(view: View){
        finish()
    }
}