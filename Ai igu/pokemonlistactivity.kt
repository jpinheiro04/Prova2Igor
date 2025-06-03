package com.example.prova2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pokemonlistactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pokemonlistactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.listview)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val pokemons = arrayOf(
            "Charmander", "Charmeleon", "Charizard",
            "Bulbasaur", "Ivysaur", "Venusaur",
            "Squirtle", "Wartortle", "Blastoise",
            "Caterpie", "Metapod", "Butterfree",
            "Weedle", "Kakuna", "Beedrill",
            "Pidgey", "Pidgeotto", "Pidgeot",
            "Rattata", "Raticate", "Spearow",
            "Fearow", "Ekans", "Arbok",
            "Pikachu", "Raichu", "Sandshrew",
            "Sandslash", "Nidoran♀", "Nidorina"
        )

        val listView = findViewById<ListView>(R.id.listview)
        val arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, pokemons)
        listView.adapter = arrayAdapter
    }
}

