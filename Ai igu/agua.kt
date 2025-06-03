package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class agua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agua)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layoutAgua)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnsquirtle = findViewById<Button>(R.id.btnsquirtle)
        val btntotodile = findViewById<Button>(R.id.btntotodile)
        val btnmudkip = findViewById<Button>(R.id.btnmudkip)

        btnsquirtle.setOnClickListener {
            startActivity(Intent(this, squirtle::class.java))
        }

        btntotodile.setOnClickListener {
            startActivity(Intent(this, totodile::class.java))
        }

        btnmudkip.setOnClickListener {
            startActivity(Intent(this, mudkip::class.java))
        }

    }
}