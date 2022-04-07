package com.example.silentmoon.signing

import android.content.Intent
import android.graphics.Color
import android.media.Image
import android.os.Build
import android.os.Bundle
import android.text.*
import android.text.method.LinkMovementMethod
import android.text.style.BackgroundColorSpan
import android.text.style.ClickableSpan
import android.text.style.ImageSpan
import android.text.style.UnderlineSpan
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
import android.view.WindowManager
import android.widget.Space
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.silentmoon.R
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //WindowCompat.setDecorFitsSystemWindows(window, false)


        silentMoonP()
        clickSpan()
    }


    private  fun silentMoonP(){
        val silentMoon: TextView = findViewById(R.id.silentMoon)
        val ssd: SpannableStringBuilder = SpannableStringBuilder()
        ssd.append("Silent  ")
        ssd.setSpan(ImageSpan(this, R.drawable.ic_logo_1), ssd.length - 1 ,ssd.length,0)
        ssd.append(" Moon")
        silentMoon.text = ssd
    }


    fun onClickGoSignUp(view: View){
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }


    private fun clickSpan() {
        val log: TextView = findViewById(R.id.log)
        val intent = Intent(this, SignInActivity::class.java)

        var spannableString = SpannableString("ALREADY HAVE AN ACCOUNT? LOG IN")
        var clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View){
                startActivity(intent)
            }
            override fun updateDrawState(ds:TextPaint){
                super.updateDrawState(ds)
                ds.color = Color.BLUE
                ds.isUnderlineText = false
            }
        }
        spannableString.setSpan(clickableSpan, 24, spannableString.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        log.text = spannableString

        log.movementMethod = LinkMovementMethod.getInstance()

    }

}