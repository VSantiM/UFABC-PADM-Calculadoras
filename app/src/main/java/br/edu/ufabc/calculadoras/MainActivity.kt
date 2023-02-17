package br.edu.ufabc.calculadoras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val buttonChangeConversor = findViewById<Button>(R.id.buttonChangeConversor)
        val buttonChangeCalculadora = findViewById<Button>(R.id.buttonChangeCalculadora)

        buttonChangeConversor.setOnClickListener {
            val myIntent = Intent(this, ConversorActivity::class.java)
            startActivity(myIntent)
        }

        buttonChangeCalculadora.setOnClickListener {
            val myIntent = Intent(this, CalculadoraActivity::class.java)
            startActivity(myIntent)
        }
    }
}