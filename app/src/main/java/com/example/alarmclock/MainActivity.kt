package com.example.alarmclock

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tempInstance = ShowCurrentTime()
        val editText = findViewById<TextView>(R.id.currentTime)

        tempInstance.showCurrentTime(editText, AppCompatActivity())

        val stopWatchButton = findViewById<Button>(R.id.stopWatch)
        stopWatchButton.setOnClickListener(){
                val intent = Intent(this, StopWatch::class.java)
                startActivity(intent) //Ten intent, to ogarnąć
        }

    }
}

