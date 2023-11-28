package com.example.telainicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Noticias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)

        val imagiviewPrincipios: ImageView = findViewById(R.id.imageView2)

        val botaoVoltar: ImageView = findViewById(R.id.botao_voltar)

        val botaoGovernaca: ImageView = findViewById(R.id.imageView4)

        val botaoSaiuImprensa: ImageView = findViewById(R.id.imageView5)

        val botaoAcionaria: ImageView = findViewById(R.id.imageView3)


        botaoVoltar.setOnClickListener {
            val intent = Intent(this, Reuniao::class.java)
            startActivity(intent)
        }

        imagiviewPrincipios.setOnClickListener {
            val intent = Intent(this, Principioss::class.java)
            startActivity(intent)
        }

        botaoGovernaca.setOnClickListener {
            val intent = Intent(this, Governaca::class.java)
            startActivity(intent)
        }

        botaoSaiuImprensa.setOnClickListener {
            val intent = Intent(this, SaiuNaImprensa::class.java)
            startActivity(intent)
        }

        botaoAcionaria.setOnClickListener {
            val intent = Intent(this, composicaoAcionaria::class.java)
            startActivity(intent)
        }
    }
}
