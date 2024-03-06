package com.example.ktp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart = findViewById<Button>(R.id.start_button)
        buttonStart.setOnClickListener {
            val intent = Intent(this, detail_ktp::class.java)
            startActivity(intent)
        }
    }
}