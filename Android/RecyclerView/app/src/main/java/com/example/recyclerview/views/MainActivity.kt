package com.example.recyclerview.views

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.CarroListAdapter
import com.example.recyclerview.data.CarroMock
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val mock = CarroMock()

        binding.recyclerView.adapter =
            CarroListAdapter(mock.listaCarros, CarroListAdapter.OnClickListener { carro ->
            Toast.makeText(this, carro.modelo, Toast.LENGTH_SHORT).show()
        })

    }
}