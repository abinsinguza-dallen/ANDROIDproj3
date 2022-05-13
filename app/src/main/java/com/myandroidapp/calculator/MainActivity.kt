package com.myandroidapp.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnPlus: Button
    lateinit var etfirstNumber: EditText
    lateinit var etsecondNumber: EditText
    lateinit var tvResult1: TextView
    lateinit var btnSubtract: Button
    lateinit var tvResult2:TextView
    lateinit var btnMultiply: Button
    lateinit var tvResult3:TextView
   lateinit var btnModulus: Button
   lateinit var tvResult4:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlus = findViewById(R.id.btnplus)
        etfirstNumber = findViewById(R.id.etfirstNumber)
        etsecondNumber = findViewById(R.id.etsecondNumber)
        tvResult1 = findViewById(R.id.tvResult1)
       btnSubtract = findViewById(R.id.btnSubtract)
        tvResult2=findViewById(R.id.tvResult2)
        btnMultiply=findViewById(R.id.btnMultiply)
        tvResult3=findViewById(R.id.tvResult3)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult4=findViewById(R.id.tvResult4)


        btnPlus.setOnClickListener {
            var firstNumber = etfirstNumber.text.toString().toInt()
            var secondNumber = etsecondNumber.text.toString().toInt()
            getResult(firstNumber, secondNumber)
        }
        btnSubtract.setOnClickListener {
            var firstNumber = etfirstNumber.text.toString().toInt()
            var secondNumber = etsecondNumber.text.toString().toInt()
            getResult2(firstNumber, secondNumber)
       }
        btnMultiply.setOnClickListener {
            var firstNumber = etfirstNumber.text.toString().toInt()
            var secondNumber = etsecondNumber.text.toString().toInt()
            getResult3(firstNumber, secondNumber)
        }
        btnModulus.setOnClickListener {
            var firstNumber = etfirstNumber.text.toString().toInt()
            var secondNumber = etsecondNumber.text.toString().toInt()
            getResult4(firstNumber, secondNumber)
        }
    }

    fun getResult(firstNumber: Int, secondNumber: Int) {
        var first = firstNumber
        var result = secondNumber + first
        tvResult1.text = result.toString()

    }

    fun getResult2(firstNumber: Int, secondNumber: Int) {
        var first = firstNumber
       var result =   first-secondNumber
       tvResult2.text = result.toString()
   }
    fun getResult3(firstNumber: Int, secondNumber: Int) {
        var first = firstNumber
        var result = secondNumber * first
        tvResult3.text = result.toString()
    }
    fun getResult4(firstNumber: Int, secondNumber: Int) {
        var first = firstNumber
        var result = first%secondNumber
        tvResult4.text = result.toString()
    }
}
