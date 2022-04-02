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
import android.widget.Toast
import com.example.silentmoon.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        clickSpan()
    }
    fun onClickGoWelcome(view: View){
        val intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
    }

    private fun clickSpan() {
        val policy: TextView = findViewById(R.id.policy)
        val intent = Intent(this, SignUpActivity::class.java)

        var spannableString = SpannableString("I HAVE READ THE PRIVACE POLICY")
        var clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View){
                Toast.makeText(this@SignUpActivity, "Тут будет политика конфиденциальности", Toast.LENGTH_SHORT).show()
            }
            override fun updateDrawState(ds:TextPaint){
                super.updateDrawState(ds)
                ds.color = Color.BLUE
                ds.isUnderlineText = false
            }
        }
        spannableString.setSpan(clickableSpan, 16, spannableString.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        policy.text = spannableString
        policy.movementMethod = LinkMovementMethod.getInstance()

    }
}