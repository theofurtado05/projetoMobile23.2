package com.example.telainicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val senhaEditText = findViewById<EditText>(R.id.senhaEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val redefinirSenhaTextView = findViewById<TextView>(R.id.redefinir_senha)
        val registroTextView = findViewById<TextView>(R.id.registro)


        val user = UserCredentials("123@123", "123456")

        loginButton.setOnClickListener {
            val inputEmail = emailEditText.text.toString()
            val inputSenha = senhaEditText.text.toString()

            if (inputEmail == user.email && inputSenha == user.senha) {
                resultTextView.text = "Login bem-sucedido!"
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
            } else {
                resultTextView.text = "Email ou senha incorretos. Tente novamente."
                Toast.makeText(
                    this,
                    "Login falhou. Verifique o email e a senha.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        registroTextView.setOnClickListener {
            // Abrir a tela de registro ao clicar no texto "Registre-se"
            val intent = Intent(this, TelaCadastro::class.java)
            startActivity(intent)
        }

        redefinirSenhaTextView.setOnClickListener {
            // Crie um Intent para iniciar a TelaRedefiniSenhaActivity
            val intent = Intent(this, TelaRedefiniSenha::class.java)

            // Inicie a nova atividade
            startActivity(intent)
        }
    }

    data class UserCredentials(val email: String, val senha: String)
}
