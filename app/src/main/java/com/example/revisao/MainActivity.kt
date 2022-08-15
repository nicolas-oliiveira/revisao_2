package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNome: TextView = findViewById(R.id.edtNome)
        val txtEndereco: TextView = findViewById(R.id.edtEndereco)
        val txtBairro: TextView = findViewById(R.id.edtBairro)
        val txtCep: TextView = findViewById(R.id.edtCep)
        val txtCidade: TextView = findViewById(R.id.edtCidade)

        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)


        btnCadastrar.setOnClickListener {

            //Toast.makeText(this, "Nome: " + txtNome.text.toString(), Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Resultado::class.java)

            intent.putExtra("nome" ,txtNome.text.toString() )

            intent.putExtra("Endereco" ,txtEndereco.text.toString())
            intent.putExtra("Bairro" ,txtBairro.text.toString())
            intent.putExtra("Cep" ,txtCep.text.toString())
            intent.putExtra("Cidade" ,txtCidade.text.toString())

            startActivity(intent)

        }
    }
}