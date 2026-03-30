package com.example.assignment1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtDay = findViewById<EditText>(R.id.edtText)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnDisplay = findViewById<Button>(R.id.btnClick)
        val txtEnter = findViewById<TextView>(R.id.txtDisplay)


        btnDisplay.setOnClickListener {
            val social = edtDay.text.toString().trim()

            if (social.isEmpty()) {
                txtEnter.text = "Please enter a time of day"
                txtEnter.setTextColor(Color.RED)
            } else if (social == "Morning") {
                txtEnter.text = "Send a Good Morning text to a family member"
                txtEnter.setTextColor(Color.BLUE)

    }
}