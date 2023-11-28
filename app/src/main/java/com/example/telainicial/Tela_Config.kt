package com.example.telainicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Tela_config : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_config)

        val imageButton: ImageButton = findViewById(R.id.imageButton)
        val button2: Button = findViewById(R.id.button2)


        // Adiciona um listener de clique ao ImageButton
        imageButton.setOnClickListener {
            // Cria uma Intent para voltar à Tela_reuniao
            val intent = Intent(this, Reuniao::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Abrir a tela de registro ao clicar no texto "Registre-se"
            val intent = Intent(this, Reuniao::class.java)
            startActivity(intent)
        }
    }
}
