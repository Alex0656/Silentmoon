package com.example.silentmoon.signing

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import com.example.silentmoon.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        clickSpan()
    }

    fun onClickGoWelcome(view: View){
        val intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
    }
    private fun clickSpan() {
        val singUp: TextView = findViewById(R.id.sign_up)
        val intent = Intent(this, SignUpActivity::class.java)

        var spannableString = SpannableString("ALREADY HAVE AN ACCOUNT? SING UP")
        var clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View){
                startActivity(intent)
            }
            override fun updateDrawState(ds: TextPaint){
                super.updateDrawState(ds)
                ds.color = Color.BLUE
                ds.isUnderlineText = false
            }
        }
        spannableString.setSpan(clickableSpan, 25, spannableString.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        singUp.text = spannableString
        singUp.movementMethod = LinkMovementMethod.getInstance()

    }
}