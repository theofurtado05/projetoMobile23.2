package com.example.telainicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.telainicial.R

class AdicionarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adicionar_reuniao)

        val Voltar: ImageView = findViewById(R.id.botao_voltar)

        val Button2: Button = findViewById(R.id.button2)


        Button2.setOnClickListener {
            val intent = Intent(this, Reuniao::class.java)
            startActivity(intent)
        }

        Voltar.setOnClickListener {
            val intent = Intent(this, Reuniao::class.java)
            startActivity(intent)
        }
    }
}
// teste 123