package br.edu.ufabc.calculadoras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CalculadoraAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversores)
    }

    override fun onStart() {
        super.onStart()

        val buttonCtoF = findViewById<Button>(R.id.buttonCtoF)
        val buttonFtoC = findViewById<Button>(R.id.buttonFtoC)


        buttonCtoF.setOnClickListener {
            val inputTextDouble : Double = (findViewById<TextView>(R.id.inputText)).text.toString().toDouble()
            val convertedResult : Double = inputTextDouble * 1.8 + 32

            val resultText = findViewById<TextView>(R.id.resultTextView)
            resultText.text = "${inputTextDouble}Cº in Farenheit is ${convertedResult}Fº"
        }

        buttonFtoC.setOnClickListener {
            val inputTextDouble : Double = (findViewById<TextView>(R.id.inputText)).text.toString().toDouble()
            val convertedResult : Double = (inputTextDouble-32) * (9.0/5.0)

            val resultText = findViewById<TextView>(R.id.resultTextView)
            resultText.text = "${inputTextDouble}Cº in Celsius is ${convertedResult}Fº"
        }
    }
}