package br.edu.ufabc.calculadoras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
    }

    override fun onStart() {
        super.onStart()

        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)

        buttonCalcular.setOnClickListener {
            val distanciaPercorridaDouble : Double = findViewById<TextView>(R.id.inputTextDistancia).text.toString().toDouble()
            val capacidadeDoTanqueDouble : Double = findViewById<TextView>(R.id.inputTextCapacidade).text.toString().toDouble()
            val porcentagemDoTanqueRemanescente : Double = findViewById<TextView>(R.id.inputTextRemanescente).text.toString().toDouble() / 100.0

            findViewById<TextView>(R.id.resultCalculadoraTextView).text = "O consumo do veículo é de ${String.format("%.1f", distanciaPercorridaDouble / (capacidadeDoTanqueDouble * porcentagemDoTanqueRemanescente))}Km/L"
        }
    }
}