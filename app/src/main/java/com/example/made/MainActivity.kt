package com.example.made

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveCalculator: Button = findViewById(R.id.btn_movealculator)
        btnMoveCalculator.setOnClickListener(this)

        val btnMoveIntent: Button = findViewById(R.id.btn_moveIntent)
        btnMoveIntent.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_movealculator -> {
               val moveCalculator = Intent(this, CalculatorActivity::class.java)
                startActivity(moveCalculator)
            }

            R.id.btn_moveIntent -> {
                val moveIntent = Intent( this, IntentActivity::class.java)
                startActivity(moveIntent)

        }
    }



}}
