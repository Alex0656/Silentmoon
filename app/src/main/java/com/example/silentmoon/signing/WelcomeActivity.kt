package com.example.silentmoon.signing

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ImageSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.TextView
import com.example.silentmoon.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        silentMoonP()
        boldSpan()
    }

    fun onClickGoChooseTopic(view: View){
        val intent = Intent(this, ChooseTopicActivity::class.java)
        startActivity(intent)
    }

    private  fun silentMoonP(){
        val silentMoon: TextView = findViewById(R.id.silentMoonWhite)
        val ssd: SpannableStringBuilder = SpannableStringBuilder()
        ssd.append("Silent  ")
        ssd.setSpan(ImageSpan(this, R.drawable.ic_logo_2), ssd.length - 1 ,ssd.length,0)
        ssd.append(" Moon")
        silentMoon.text = ssd
    }

    private fun boldSpan() {
        val welcomeSM: TextView = findViewById(R.id.welcomeSM)
        val spannable = SpannableString("Hi Afsar, Welcome to Silent Moon")
        spannable.setSpan(StyleSpan(Typeface.BOLD), 0, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        welcomeSM.text = spannable
    }

}