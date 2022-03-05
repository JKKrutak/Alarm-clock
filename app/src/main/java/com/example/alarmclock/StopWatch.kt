package com.example.alarmclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StopWatch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)
        val editText = findViewById<TextView>(R.id.textTimer)
        val instance = ShowCurrentTime();
        instance.timer(editText, AppCompatActivity())
        val startTimerButton = findViewById<Button>(R.id.startTimer)
        val stopTimerButton = findViewById<Button>(R.id.stopTimer)

    }




}