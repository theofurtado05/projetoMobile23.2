package com.example.telainicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class composicaoAcionaria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_composicao_acionaria)


        val Voltar: ImageView = findViewById(R.id.botao_voltar)


        Voltar.setOnClickListener {
            val intent = Intent(this, Noticias::class.java)
            startActivity(intent)

        }
    }
}