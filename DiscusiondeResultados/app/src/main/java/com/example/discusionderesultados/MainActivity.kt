package com.example.discusionderesultados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var a: EditText
lateinit var b: EditText
lateinit var sumaRes: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a = findViewById(R.id.TxtNum1)
        b = findViewById(R.id.TxtNum2)
        sumaRes = findViewById(R.id.BtnSumar)
        resultado = findViewById(R.id.LlbResultado)

        sumaRes.setOnClickListener{
            var A: Float = a.text.toString().toFloat()
            var B: Float = b.text.toString().toFloat()
            var total = A + B
            resultado.setText( A+ " + " + B + " = " + total.toString())
        }
    }
}