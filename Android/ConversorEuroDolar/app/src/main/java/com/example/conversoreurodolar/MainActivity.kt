package com.example.conversoreurodolar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversoreurodolar.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            // guardar na constante o valor do utilizador. Nao precisa aferir o tipo de dado, mas vamos utilizar
            val eurosUtilizador: Double = binding.editEuros.text.toString().toDouble()
            val valorDolares = (eurosUtilizador * 1.1 * 100).roundToInt().toDouble() / 100;
            binding.textDollars.text = "$valorDolares" + "$"
        }
        binding.convertaTemperatura.setOnClickListener {
            var celsiusUtilizador : Double = binding.inputCelsius.text.toString().toDouble()
            var valorFahrenheit = (celsiusUtilizador * 1.8) + 32;
            binding.fahrenheit.text = "$valorFahrenheit" + "ºF"
        }
    }
}