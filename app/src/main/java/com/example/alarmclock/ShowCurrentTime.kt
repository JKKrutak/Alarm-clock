package com.example.alarmclock

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.util.*

class ShowCurrentTime {
    //Trzeba zmienic nazwe funkcji i te parametry tutaj, kurde dziwne są.
    fun showCurrentTime(editText: TextView, activity: AppCompatActivity) {
        Thread {
            while(true) {
                val currentDateTimeString = DateFormat.getDateTimeInstance().format(Date())
                Thread.sleep(1_000)
                activity.runOnUiThread {
                    editText.text = currentDateTimeString
                }
            }
        }.start()
    }

    fun timer(editText: TextView, activity: AppCompatActivity) {
        Thread {//Nie wchodzi do wątku tego tu w ogóle :(
            editText.text = "nie działa"
            //var startTime
            //val timeToShow
            //val measuretTime
            while(true) {//.format(date()) zapytać dlaczego tak
                //startTime = DateFormat.getDateTimeInstance().format(Date())

            }
        }


    }



}