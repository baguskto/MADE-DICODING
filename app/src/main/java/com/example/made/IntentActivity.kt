package com.example.made

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.made.IntentPacakage.MoveWithData

class IntentActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val btnMoveWithData: Button = findViewById(R.id.btn_moveWithData)
        btnMoveWithData.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_moveWithData -> {
                val moveWithDataIntent = Intent(this,MoveWithData::class.java)
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_NAME, "Dicoding")
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_AGE, "6")
                startActivity(moveWithDataIntent)
            }
        }
    }

}
