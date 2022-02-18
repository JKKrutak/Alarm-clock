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
       // val executorService: ExecutorService = Executors.newFixedThreadPool(4)
        val x = true
        val tempInstance = ShowCurrentTime()
        val editText = findViewById<TextView>(R.id.currentTime)
        tempInstance.showCurrentTime(editText)

        val stopWatchButton = findViewById<Button>(R.id.stopWatch)
        stopWatchButton.setOnClickListener(){
            Thread({
                val intent = Intent(this, StopWatch::class.java)
                startActivity(intent)
            }).start()
        }

    }
}