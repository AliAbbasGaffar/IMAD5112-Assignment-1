package com.example.assignment1

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

        val edtDay = findViewById<EditText>(R.id.edtText) //Variable for Input
        val btnReset = findViewById<Button>(R.id.btnReset) //Variable to Reset the app
        val btnDisplay = findViewById<Button>(R.id.btnClick) //Variable to Display
        val txtEnter = findViewById<TextView>(R.id.txtDisplay) //Variable for Output
    }
}