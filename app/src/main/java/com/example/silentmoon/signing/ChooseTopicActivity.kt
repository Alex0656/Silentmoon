package com.example.silentmoon.signing

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.view.View
import android.widget.TextView
import com.example.silentmoon.R

class ChooseTopicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_topic)
        boldSpan()
    }

    fun onClickGoReminders(view: View){
        val intent = Intent(this, RemindersActivity::class.java)
        startActivity(intent)
    }


    private fun boldSpan() {
        val what_brings: TextView = findViewById(R.id.what_brings)
        val spannable = SpannableString("What Brings you to Silent Moon?")
        spannable.setSpan(StyleSpan(Typeface.BOLD), 0, 15, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        what_brings.text = spannable
    }
}