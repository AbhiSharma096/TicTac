package com.example.tictac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Leaderboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        var winners = arrayOfNulls<String>(5)
        val v1 = findViewById<TextView>(R.id.first)
        v1.text = ""




    }
}