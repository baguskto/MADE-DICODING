package com.example.made

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val btnMoveCalculator: Button = findViewById(R.id.btn_movealculator)
    val btnMoveIntent: Button = findViewById(R.id.btn_moveIntent)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_movealculator -> {
               val moveCalculator = Intent(this, CalculatorActivity::class.java)
                startActivity(moveCalculator)
            }
        }
    }

}
