package com.example.minutnik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //values for buttons and textviews

        val buttonTenMinsUp = findViewById<Button>(R.id.tenMinsUp)
        val buttonMinsUp = findViewById<Button>(R.id.minsUp)
        val buttonTenSecsUp = findViewById<Button>(R.id.tenSecsUp)
        val buttonSecsUp = findViewById<Button>(R.id.secsUp)

        val buttonTenMinsDown = findViewById<Button>(R.id.tenMinsDown)
        val buttonMinsDown = findViewById<Button>(R.id.minsDown)
        val buttonTenSecsDown = findViewById<Button>(R.id.tenSecsDown)
        val buttonSecsDown = findViewById<Button>(R.id.secsDown)

        val textTenMins = findViewById<TextView>(R.id.tenMins)
        val textMins = findViewById<TextView>(R.id.mins)
        val textTenSecs = findViewById<TextView>(R.id.tenSecs)
        val textSecs = findViewById<TextView>(R.id.secs)

        //onClick functions for adding time

        buttonTenMinsUp.setOnClickListener {
            var number = textTenMins.text.toString().toInt()
            if (textMins.text.toString().toInt()>0){
                number=(number+1)%6
            }
            else{
                number=(number+1)%7
            }

            textTenMins.text=number.toString()
        }

        buttonMinsUp.setOnClickListener {
            var number = textMins.text.toString().toInt()

            number=(number+1)%10
            textMins.text=number.toString()

        }

        buttonTenSecsUp.setOnClickListener {
            var number = textTenSecs.text.toString().toInt()
            if (textSecs.text.toString().toInt()>0){
                number=(number+1)%6
            }
            else{
                number=(number+1)%7
            }

            textTenSecs.text=number.toString()
        }

        buttonSecsUp.setOnClickListener {
            var number = textSecs.text.toString().toInt()

            number=(number+1)%10
            textSecs.text=number.toString()

        }

        //onClick functions for substracting time

        buttonTenMinsDown.setOnClickListener {
            var number = textTenMins.text.toString().toInt()
            if (textMins.text.toString().toInt()>0){
                number=(number-1)%6
            }
            else{
                number=(number-1)%7
            }

            textTenMins.text=number.toString()
        }
    }
}