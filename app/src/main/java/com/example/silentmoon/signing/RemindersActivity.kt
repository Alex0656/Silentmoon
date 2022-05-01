package com.example.silentmoon.signing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.NumberPicker
import com.example.silentmoon.R

class RemindersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reminders)

        val numberPicker1 = findViewById<NumberPicker>(R.id.numberPicker1)
        numberPicker1.minValue = 1
        numberPicker1.maxValue = 12

        val numberPicker2 = findViewById<NumberPicker>(R.id.numberPicker2)
        numberPicker2.minValue = 1
        numberPicker2.maxValue = 59

        val numberPicker3 = findViewById<NumberPicker>(R.id.numberPicker3)

        val str = arrayOf<String>("AM","PM")
        numberPicker3.minValue = 0
        numberPicker3.maxValue = (str.size - 1)
        numberPicker3.displayedValues = str
    }

    fun onClickGoHome(view: View){
        val intent = Intent(this, ManagerHomeActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoHome2(view: View){
        val intent = Intent(this, ManagerHomeActivity::class.java)
        startActivity(intent)
    }
}