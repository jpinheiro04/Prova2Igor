package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        AlertDialog.Builder(this)
            .setTitle("Deseja Salvar o Login?")
            .setMessage("Ação ficticia, nenhum login foi ferido neste código")
            .setPositiveButton("Salvar") {
                                         variavel, numeroOpcao ->
            }
            .setNegativeButton("Excluir") {
                                          variavel, numeroOpcao ->
            }

            .create()
            .show()

        setSupportActionBar(findViewById(R.id.toolbar))

        val btnFogo = findViewById<Button>(R.id.btnfogo)
        val btnAgua = findViewById<Button>(R.id.btnagua)
        val btnPlanta = findViewById<Button>(R.id.btnplanta)

        btnFogo.setOnClickListener {
            startActivity(Intent(this, fogo::class.java))
        }

        btnAgua.setOnClickListener {
            startActivity(Intent(this, agua::class.java))
        }

        btnPlanta.setOnClickListener {
            startActivity(Intent(this, planta::class.java))
        }
        val btnIcone = findViewById<ImageButton>(R.id.btnIcone)

        btnIcone.setOnClickListener {
            Toast.makeText(this, "Oi eu sou um icone", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.botãoação1 -> {
                Toast.makeText(this, "PikaCruel pikachu + tentacruel",
                    Toast.LENGTH_LONG).show()
            }
        }
        return true

    }
}