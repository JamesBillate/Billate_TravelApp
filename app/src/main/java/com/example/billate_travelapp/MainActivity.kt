package com.example.billate_travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnDestination: Button = findViewById(R.id.btnDestination)
        val btnTravelTips: Button = findViewById(R.id.btnTips)
        val btnGallery: Button = findViewById(R.id.btnGallery)
        val btnContactUs: Button = findViewById(R.id.btnContacts)

        btnDestination.setOnClickListener {
           val intent = Intent(this, Destinations::class.java)
            startActivity(intent)
        }

        btnTravelTips.setOnClickListener {
            val intent = Intent(this, TravelTips::class.java)
            startActivity(intent)
        }

        btnContactUs.setOnClickListener {
            val intent = Intent(this, ContactUs::class.java)
            startActivity(intent)
        }
    }
}