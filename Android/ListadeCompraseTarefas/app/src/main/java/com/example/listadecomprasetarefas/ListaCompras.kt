package com.example.listadecomprasetarefas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.listadecomprasetarefas.databinding.ActivityListaComprasBinding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class ListaCompras : AppCompatActivity() {

    private val binding by lazy {
        ActivityListaComprasBinding.inflate(layoutInflater)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*TELA INTEIRA*/

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        /*NÃO DEIXAR BLOQUEAR O TELEMOVEL AUTOMATICAMENTE*/

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)


        val listaProdutos = ArrayList<String>()


        binding.imageViewAddProduto.setOnClickListener {
            val insertProduct = binding.editTextInserirProduto.text.toString()
            listaProdutos.add(insertProduct)

            val listaProdutosWithIndex = listaProdutos.mapIndexed { index, value -> "${index+1} -> $value" }
            val arrayAdapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, listaProdutosWithIndex)
            binding.listViewListaCompras.adapter = arrayAdapter
        }

        binding.imageViewRemoverProduto.setOnClickListener{

            val removeProduct = binding.editTextRemoverProduto.text.toString()
            listaProdutos.remove(removeProduct)

            val listaProdutosWithIndex = listaProdutos.mapIndexed { index, value -> "${index+1} -> $value" }
            val arrayAdapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, listaProdutosWithIndex)
            binding.listViewListaCompras.adapter = arrayAdapter
        }

        binding.buttonVoltar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}