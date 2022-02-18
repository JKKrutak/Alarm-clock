package com.example.alarmclock

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.util.*

class ShowCurrentTime :  AppCompatActivity() {

    fun showCurrentTime(editText: TextView) {
        val currentDateTimeString = DateFormat.getDateTimeInstance().format(Date())
        editText.text = currentDateTimeString

    }

}