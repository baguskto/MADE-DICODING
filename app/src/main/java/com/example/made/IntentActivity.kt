package com.example.made

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.made.IntentPacakage.MoveWithData
import com.example.made.IntentPacakage.MoveWithObjectActivity
import com.example.made.IntentPacakage.MoveWithResultActivity
import com.example.made.IntentPacakage.Person
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvResult: TextView

    companion object{
        private const val REQUEST_CODE = 100
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val btnMoveWithData: Button = findViewById(R.id.btn_moveWithData)
        btnMoveWithData.setOnClickListener(this)

        val btnMoveWithPArcelable: Button= findViewById(R.id.btn_moveWithParcelable)
        btnMoveWithPArcelable.setOnClickListener(this)

        val btnMoveIntentImplicit: Button= findViewById(R.id.btn_intentImplicit)
        btnMoveIntentImplicit.setOnClickListener(this)

        val btnMoveForResult: Button = findViewById(R.id.btn_move_for_result)
        btnMoveForResult.setOnClickListener(this)

        tvResult = findViewById(R.id.tv_result)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_moveWithData -> {
                val moveWithDataIntent = Intent(this,MoveWithData::class.java)
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_NAME, "Dicoding")
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_AGE, "6")
                startActivity(moveWithDataIntent)
            }

            R.id.btn_moveWithParcelable ->{
                val person = Person(
                    "Bagus",
                    25,
                    "baguskto@gmail.com",
                    "Yogyakarta"
                )
                val moveWithObjectActivity = Intent( this, MoveWithObjectActivity::class.java)
                moveWithObjectActivity.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(moveWithObjectActivity)
            }

            R.id.btn_intentImplicit ->{
                val phoneNumber = "085743692726"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }

            R.id.btn_move_for_result -> {
                val moveForResultIntent = Intent(this, MoveWithResultActivity::class.java)
                startActivityForResult(moveForResultIntent, REQUEST_CODE)
            }

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE){
            if (resultCode == MoveWithResultActivity.RESULT_CODE){
                val selectedValue = data?.getIntExtra(MoveWithResultActivity.EXTRA_SELECTED_VALUE,0)
                tvResult.text = "Hasil : $selectedValue"
            }

        }
    }
}
