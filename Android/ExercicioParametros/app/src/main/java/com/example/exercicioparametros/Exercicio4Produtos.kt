package com.example.exercicioparametros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioparametros.databinding.ActivityExercicio4ProdutosBinding

class Exercicio4Produtos : AppCompatActivity() {
    private val binding by lazy{
        ActivityExercicio4ProdutosBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val checkBoxes = arrayOf(
            findViewById<CheckBox>(R.id.checkBox_produto1),
            findViewById<CheckBox>(R.id.checkBox_produto2),
            findViewById<CheckBox>(R.id.checkBox_produto3),
            findViewById<CheckBox>(R.id.checkBox_produto4),
            findViewById<CheckBox>(R.id.checkBox_produto5),
            findViewById<CheckBox>(R.id.checkBox_produto6),
            findViewById<CheckBox>(R.id.checkBox_produto7),
            findViewById<CheckBox>(R.id.checkBox_produto8),
            findViewById<CheckBox>(R.id.checkBox_produto9)
        )

        val button = findViewById<Button>(R.id.button_pedido)

        button.setOnClickListener {
            val selectedProducts = checkBoxes.filter { it.isChecked }.map { it.text.toString() }
            val intent = Intent(this, SplashScreenActivity::class.java)
            intent.putStringArrayListExtra("selected_products", ArrayList(selectedProducts))
            startActivity(intent)
        }

        binding.buttonPedido.setOnClickListener{

        }

    }
}