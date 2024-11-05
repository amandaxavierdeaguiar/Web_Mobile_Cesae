package com.example.exercicioslista

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaNome = ArrayList<Nome>()

        listaNome.add(Nome("Amanda"))
        listaNome.add(Nome("Adilson"))
        listaNome.add(Nome("Bianca"))
        listaNome.add(Nome("Andrea"))
        listaNome.add(Nome("Aurelio"))

        binding.listViewNomes.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_activated_1,listaNome)

        binding.listViewNomes.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Olá ${listaNome.get(position)}", Toast.LENGTH_LONG).show()
        }
    }
}