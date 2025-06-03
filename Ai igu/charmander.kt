package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class charmander : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_charmander)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<Button>(R.id.carregacharmander)
        button.setOnClickListener{
            var url = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png"
            var imagemView = findViewById<ImageView>(R.id.imgcharmander)
            Glide.with(this).load(url).into(imagemView)
        }

        val buttonlist = findViewById<Button>(R.id.buttonlist)

        buttonlist.setOnClickListener {
            val intent = Intent(this, pokemonlistactivity::class.java)
            startActivity(intent)
        }

        val buttoncard = findViewById<Button>(R.id.buttoncard)

        buttoncard.setOnClickListener {
            val intent = Intent(this, especiais::class.java)
            startActivity(intent)
        }
    }
}