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
            } else if (social == "Mid-Morning") {
                txtEnter.text = "Reach out to a colleague with a quick Thank you"
                txtEnter.setTextColor(Color.YELLOW)
            } else if (social == "Afternoon") {
                txtEnter.text = "Share a funny meme or interesting link with a friend"
                txtEnter.setTextColor(Color.parseColor("#A52A2A"))
            } else if (social == "Afternoon Snack time"){
                txtEnter.text = "Send a quick thinking of you message"
                txtEnter.setTextColor(Color.parseColor("#FFA500")) 
    }
}