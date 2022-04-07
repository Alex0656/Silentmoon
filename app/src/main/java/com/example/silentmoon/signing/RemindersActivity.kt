package com.example.silentmoon.signing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.NumberPicker
import android.widget.Toast
import com.example.silentmoon.R
import java.util.*
import java.util.Calendar.AM
import java.util.Calendar.PM

class RemindersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reminders)

        val numberPicker1 = findViewById<NumberPicker>(R.id.numberPicker1)
        numberPicker1.minValue = 1
        numberPicker1.maxValue = 12

        val numberPicker2 = findViewById<NumberPicker>(R.id.numberPicker2)
        numberPicker2.minValue = 1
        numberPicker2.maxValue = 60

        val numberPicker3 = findViewById<NumberPicker>(R.id.numberPicker3)

        val str = arrayOf<String>("AM","PM")
        numberPicker3.minValue = 0
        numberPicker3.maxValue = (str.size - 1)
        numberPicker3.displayedValues = str
    }
}