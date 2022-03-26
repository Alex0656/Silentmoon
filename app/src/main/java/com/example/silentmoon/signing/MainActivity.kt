package com.example.silentmoon.signing

import android.content.Intent
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.text.*
import android.text.method.LinkMovementMethod
import android.text.style.BackgroundColorSpan
import android.text.style.ClickableSpan
import android.text.style.ImageSpan
import android.view.View
import android.widget.Space
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.silentmoon.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //silentMoon()
        silentMoonP()
        //textlog()
    }
    private fun silentMoon(){
        val silentMoon: TextView = findViewById(R.id.silentMoon)
        //silentMoon = findViewById(R.id.silentMoon)
        //var text:String = "Silent Moon"
        //var spannable: SpannableString = SpannableString(text)
        val spannable = SpannableString("Silent Moon")
        spannable.setSpan(BackgroundColorSpan(Color.BLUE),0,6, Spanned.SPAN_INCLUSIVE_INCLUSIVE)

        silentMoon.text = spannable
    }
    private  fun silentMoonP(){
        val silentMoon: TextView = findViewById(R.id.silentMoon)
        val ssd: SpannableStringBuilder = SpannableStringBuilder()
        ssd.append("Silent  ")
        ssd.setSpan(ImageSpan(this, R.drawable.logo_2), ssd.length - 1 ,ssd.length,0)
        ssd.append(" Moon")
        silentMoon.text = ssd
    }


    private  fun TextView.setLinkedText (
        linkClickListener: () -> Unit
    ) {

        val log: TextView = findViewById(R.id.log)
        val spannable = SpannableString("ALREADY HAVE AN ACCOUNT? LOG IN")

        log.movementMethod = LinkMovementMethod.getInstance()

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                linkClickListener()
            }
            override fun updateDrawState(logg : TextPaint){
                super.updateDrawState(logg)
                logg.color = Color.BLUE
                logg.isUnderlineText = false
            }
        }
        spannable.setSpan(clickableSpan,24,spannable.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        log.text = spannable

    }


    fun onClickGoSignUp(view: View){
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
}