package com.example.made.IntentPacakage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.made.R

class MoveWithData : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val  EXTRA_NAME = "estra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)


        val tvDataRecieved: TextView = findViewById(R.id.tv_dataReceived)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getStringExtra(EXTRA_AGE)

        val text = "Name: $name, Your Age : $age"
        tvDataRecieved.text = text
    }
}
