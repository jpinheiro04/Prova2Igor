package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class planta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_planta)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layoutPlanta)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnbulbasaur = findViewById<Button>(R.id.btnbulbasaur)
        val btnchikorita = findViewById<Button>(R.id.btnchikorita)
        val btntreecko = findViewById<Button>(R.id.btntreecko)

        btnbulbasaur.setOnClickListener {
            startActivity(Intent(this, bulbasaur::class.java))
        }

        btnchikorita.setOnClickListener {
            startActivity(Intent(this, chikorita::class.java))
        }

        btntreecko.setOnClickListener {
            startActivity(Intent(this, treecko::class.java))
        }
    }
}