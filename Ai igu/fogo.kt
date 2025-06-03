package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fogo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layoutFogo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btncharmander = findViewById<Button>(R.id.btncharmander)
        val btncyndaquil = findViewById<Button>(R.id.btncyndaquil)
        val btntorchic = findViewById<Button>(R.id.btntorchic)

        btncharmander.setOnClickListener {
            startActivity(Intent(this, charmander::class.java))
        }

        btncyndaquil.setOnClickListener {
            startActivity(Intent(this, cyndaquil::class.java))
        }

        btntorchic.setOnClickListener {
            startActivity(Intent(this, torchic::class.java))
        }
    }
}