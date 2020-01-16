package com.example.made

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*

class CalculatorActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtLenght : EditText
    private lateinit var btnCalculate : Button
    private lateinit var tvResult : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)



        edtWidth = findViewById(R.id.edt_width)
        edtHeight = findViewById(R.id.edt_height)
        edtLenght = findViewById(R.id.edt_lenght)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_calculateResult)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_calculate){
            val inputLenght = edtLenght.text.toString()
            val inputWidth = edtLenght.text.toString()
            val inputHeight = edtHeight.text.toString()

            var isEmptyFields = false

            if(inputLenght.isEmpty()) {
                isEmptyFields= true
                edtLenght.error = "Field lenght tidak boleh kosong"
            }

            if (inputWidth.isEmpty()){
                isEmptyFields= true
                edtWidth.error= "Fields width tidak boleh kosong"
            }

            if (inputHeight.isEmpty()) {
                isEmptyFields = true
                edtHeight.error= "Field height tidak boleh kosong"
            }

            if (isEmptyFields) {
                val volume = inputLenght.toDouble() *inputWidth.toDouble()* inputHeight.toDouble()
                tvResult.text = volume.toString()
            }

        }
    }

}



